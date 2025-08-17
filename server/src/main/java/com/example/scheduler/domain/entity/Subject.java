package com.example.scheduler.domain.entity;

import com.example.scheduler.config.entity.ClassEntityId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "subject")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Subject extends ClassEntityId {

    private String name;
    private String cpfCnpj;

}
