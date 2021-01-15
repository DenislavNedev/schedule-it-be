package com.uni.sofia.schedule.it.repositories;

import com.uni.sofia.schedule.it.data.AppEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppEventRepository extends JpaRepository<AppEvent, Integer> {

}
