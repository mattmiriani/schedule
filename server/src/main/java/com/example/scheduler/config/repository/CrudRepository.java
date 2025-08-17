package com.example.scheduler.config.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CrudRepository<CLASS, ID> extends JpaRepository<CLASS, ID>, JpaSpecificationExecutor<CLASS> {
}
