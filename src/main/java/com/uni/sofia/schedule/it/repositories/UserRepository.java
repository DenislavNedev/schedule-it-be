package com.uni.sofia.schedule.it.repositories;

import com.uni.sofia.schedule.it.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
