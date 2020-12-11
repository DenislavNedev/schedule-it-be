package com.uni.sofia.schedule.it.controllers;

import com.uni.sofia.schedule.it.data.User;
import com.uni.sofia.schedule.it.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.uni.sofia.schedule.it.utils.EndPointsConstants.*;

@RestController
@RequestMapping(value = USERS_CONTROLLER_ENDPOINT)
public class UserController {
    @Autowired
    UserRepository userRepository;

    //This is for test purpose only
    @GetMapping(value = GET_ALL_USERS_ENDPOINT)
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping(value = REGISTER_ENDPOINT)
    public List<User> persist(@RequestBody final User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }
}
