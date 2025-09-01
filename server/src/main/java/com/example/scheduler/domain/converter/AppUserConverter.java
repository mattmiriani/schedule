package com.example.scheduler.domain.converter;

import com.example.scheduler.domain.dto.AppUserDTO;
import com.example.scheduler.domain.entity.AppUser;

public class AppUserConverter {

    public static AppUser from(AppUserDTO appUserDTO) {
        AppUser appUser = new AppUser();

        appUserDTO.setId(appUserDTO.getId());
        appUserDTO.setEmail(appUserDTO.getEmail());
        appUserDTO.setUsername(appUserDTO.getUsername());

        return appUser;
    }

    public static AppUserDTO to(AppUser appUser) {
        AppUserDTO appUserDTO = new AppUserDTO();

        appUserDTO.setId(appUser.getId());
        appUserDTO.setEmail(appUser.getEmail());
        appUserDTO.setUsername(appUser.getUsername());

        return appUserDTO;
    }
}
