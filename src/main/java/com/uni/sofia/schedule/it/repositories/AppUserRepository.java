package com.uni.sofia.schedule.it.repositories;

import com.uni.sofia.schedule.it.data.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByUsername(String username);
}
