package com.uni.sofia.schedule.it.controllers;

import com.uni.sofia.schedule.it.data.AppEvent;
import com.uni.sofia.schedule.it.data.AppSlot;
import com.uni.sofia.schedule.it.repositories.AppEventRepository;
import com.uni.sofia.schedule.it.repositories.AppSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.uni.sofia.schedule.it.utils.EndPointsConstants.*;

@RestController
@RequestMapping(value = EVENTS_CONTROLLER_ENDPOINT)
public class AppEventController {
    @Autowired
    AppEventRepository appEventRepository;

    @GetMapping(value = GET_ALL_EVENTS_ENDPOINT)
    public List<AppEvent> getAll() {
        return appEventRepository.findAll();
    }

    @PostMapping(value = ADD_EVENT_ENDPOINT)
    public void addEvent(@RequestBody final AppEvent appEvent) {
        appEventRepository.save(appEvent);
    }
}
