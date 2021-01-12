package com.uni.sofia.schedule.it.repositories;

import com.uni.sofia.schedule.it.data.AppSlot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppSlotRepository extends JpaRepository<AppSlot, Integer> {
}