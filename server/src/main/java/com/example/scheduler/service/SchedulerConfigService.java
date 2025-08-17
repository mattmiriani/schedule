package com.example.scheduler.service;

import com.example.scheduler.config.service.CrudService;
import com.example.scheduler.domain.entity.ScheduleConfig;
import com.example.scheduler.repository.SchedulerConfigRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class SchedulerConfigService extends CrudService<ScheduleConfig, UUID> {

    private final SchedulerConfigRepository repository;

    @PostConstruct
    public void init() {
        super.setRepository(repository);
    }
}
