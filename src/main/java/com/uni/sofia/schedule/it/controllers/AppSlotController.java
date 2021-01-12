package com.uni.sofia.schedule.it.controllers;

import com.uni.sofia.schedule.it.data.AppSlot;
import com.uni.sofia.schedule.it.repositories.AppSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.uni.sofia.schedule.it.utils.EndPointsConstants.*;

@RestController
@RequestMapping(value = SLOTS_CONTROLLER_ENDPOINT)
public class AppSlotController {
    @Autowired
    AppSlotRepository appSlotRepository;

    @GetMapping(value = GET_ALL_SLOTS_ENDPOINT)
    public List<AppSlot> getAll() {
        return appSlotRepository.findAll();
    }

    @PostMapping(value = ADD_SLOT_ENDPOINT)
    public void addSlot(@RequestBody final AppSlot appSlot) {
        appSlotRepository.save(appSlot);
    }

//    @PatchMapping(value = SAVE_DELAY_ENDPOINT)
//    public void saveDelay(@RequestBody final int delay) {
//
//    }
}
