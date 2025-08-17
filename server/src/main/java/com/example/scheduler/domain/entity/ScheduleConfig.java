package com.example.scheduler.domain.entity;

import com.example.scheduler.config.entity.ClassEntityId;
import com.example.scheduler.enums.DayOfWeek;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "schedule_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ScheduleConfig extends ClassEntityId {

    private LocalDate startDate;

    private LocalDate finishDate;

    private LocalTime startTime;

    private LocalTime finishTime;

    private LocalTime duration;

    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;
}
