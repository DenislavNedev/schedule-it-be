package com.uni.sofia.schedule.it.controllers;

import com.uni.sofia.schedule.it.data.AppUser;
import com.uni.sofia.schedule.it.data.VerificationCodes;
import com.uni.sofia.schedule.it.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.uni.sofia.schedule.it.utils.EndPointsConstants.*;

@RestController
@RequestMapping(value = USERS_CONTROLLER_ENDPOINT)
public class AppUserController {
    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    //TODO Add error handling

    //This is for test purpose only
    @GetMapping(value = GET_ALL_USERS_ENDPOINT)
    public List<AppUser> getAll() {
        return appUserRepository.findAll();
    }

    @GetMapping(value = GET_USER_BY_USERNAME)
    public AppUser getUser(@PathParam(value = "username") String username) {
        return appUserRepository.findByUsername(username);
    }

    @GetMapping(value = GET_ALL_VERIFICATION_CODES)
    public VerificationCodes getAllVerificationCodes() {
        List<String> codes = appUserRepository.findAll()
                .stream()
                .map(AppUser::getVerificationCode)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        VerificationCodes verificationCodes = new VerificationCodes();
        verificationCodes.setCodes(codes);
        return verificationCodes;
    }

    @PatchMapping(value = GET_ALL_VERIFICATION_CODES)
    public void updateVerificationCode(@PathParam(value = "verificationCode") String verificationCode,
                                       @PathParam(value = "username") String username) {
        AppUser appUser = appUserRepository.findByUsername(username);
        appUser.setVerificationCode(verificationCode);
        appUserRepository.save(appUser);
    }

    @PostMapping(value = REGISTER_ENDPOINT)
    public void signUp(@RequestBody final AppUser appUser) {
        appUser.setPassword(bCryptPasswordEncoder.encode(appUser.getPassword()));
        appUserRepository.save(appUser);
    }
}
