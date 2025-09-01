package com.example.scheduler.repository;

import com.example.scheduler.domain.entity.AppUser;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, UUID> {
}
