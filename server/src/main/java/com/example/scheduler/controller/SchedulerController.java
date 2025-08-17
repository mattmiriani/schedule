package com.example.scheduler.controller;

import com.example.scheduler.domain.entity.ScheduleConfig;
import com.example.scheduler.service.SchedulerConfigService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/scheduler")
@AllArgsConstructor
public class SchedulerController {

    private final SchedulerConfigService schedulerConfigService;

    @GetMapping
    public ScheduleConfig findById() {
        return schedulerConfigService.findById(UUID.fromString("8a9b4ac6-7593-11f0-abe1-eef21908b501"));
    }
}
