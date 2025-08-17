package com.example.scheduler.domain.dto;

import com.example.scheduler.enums.DayOfWeek;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Data
public class SchedulerConfigDTO {

    private UUID id;
    private LocalDate startDate;
    private LocalDate finishDate;
    private LocalTime startTime;
    private LocalTime finishTime;
    private LocalTime duration;
    private DayOfWeek dayOfWeek;

}
