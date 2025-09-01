package com.example.scheduler.domain.dto;


import lombok.Data;

import java.util.UUID;

@Data
public class AppUserDTO {

    private UUID id;
    private String username;
    private String email;
}
