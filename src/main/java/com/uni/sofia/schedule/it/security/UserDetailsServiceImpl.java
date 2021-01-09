package com.uni.sofia.schedule.it.security;

import com.uni.sofia.schedule.it.data.AppUser;
import com.uni.sofia.schedule.it.repositories.AppUserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private AppUserRepository applicationAppUserRepository;

    public UserDetailsServiceImpl(AppUserRepository applicationAppUserRepository) {
        this.applicationAppUserRepository = applicationAppUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser applicationAppUser = applicationAppUserRepository.findByUsername(username);
        if (applicationAppUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(applicationAppUser.getUsername(), applicationAppUser.getPassword(), emptyList());
    }
}