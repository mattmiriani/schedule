package com.example.scheduler.domain.converter;

import com.example.scheduler.domain.dto.SchedulerConfigDTO;
import com.example.scheduler.domain.entity.ScheduleConfig;

public class SchedulerConfigConverter {

    public static ScheduleConfig from(SchedulerConfigDTO schedulerConfigDTO) {
        ScheduleConfig scheduleConfig = new ScheduleConfig();

        scheduleConfig.setId(schedulerConfigDTO.getId());
        scheduleConfig.setStartDate(schedulerConfigDTO.getStartDate());
        scheduleConfig.setFinishDate(schedulerConfigDTO.getFinishDate());
        scheduleConfig.setStartTime(schedulerConfigDTO.getStartTime());
        scheduleConfig.setFinishTime(schedulerConfigDTO.getFinishTime());
        scheduleConfig.setDuration(schedulerConfigDTO.getDuration());
        scheduleConfig.setDayOfWeek(schedulerConfigDTO.getDayOfWeek());

        return new ScheduleConfig();
    }

    public static SchedulerConfigDTO to(ScheduleConfig scheduleConfig) {
        SchedulerConfigDTO schedulerConfigDTO = new SchedulerConfigDTO();

        schedulerConfigDTO.setId(scheduleConfig.getId());
        schedulerConfigDTO.setStartDate(scheduleConfig.getStartDate());
        schedulerConfigDTO.setFinishDate(scheduleConfig.getFinishDate());
        schedulerConfigDTO.setStartTime(scheduleConfig.getStartTime());
        schedulerConfigDTO.setFinishTime(scheduleConfig.getFinishTime());
        schedulerConfigDTO.setDuration(scheduleConfig.getDuration());
        schedulerConfigDTO.setDayOfWeek(scheduleConfig.getDayOfWeek());

        return schedulerConfigDTO;
    }
}
