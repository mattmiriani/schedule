package com.example.scheduler.service;

import com.example.scheduler.domain.entity.AppUser;
import com.example.scheduler.repository.AppUserRepository;
import com.example.scheduler.service.keycloak.KeycloakAdminService;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class AppUserService extends CrudService<AppUser, UUID> {

    private final AppUserRepository repository;
    private final KeycloakAdminService keycloakService;

    @PostConstruct
    public void init() {
        super.setRepository(repository);
    }

    @Override
    protected void afterUpdate(AppUser entity) {
        AppUser user = this.findById(entity.getId());
        keycloakService.updateUser(user);

        super.save(user);
    }
}
