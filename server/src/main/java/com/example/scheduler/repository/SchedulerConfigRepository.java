package com.example.scheduler.repository;

import com.example.scheduler.config.repository.CrudRepository;
import com.example.scheduler.domain.entity.ScheduleConfig;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SchedulerConfigRepository extends CrudRepository<ScheduleConfig, UUID> {
}
