package com.example.scheduler.domain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class SubjectDTO {

    private UUID id;
    private String name;
    private String cpfCnpj;

}
