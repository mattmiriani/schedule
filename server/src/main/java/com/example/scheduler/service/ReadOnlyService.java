package com.example.scheduler.service;

import com.example.scheduler.repository.CrudRepository;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@Setter
@Transactional(readOnly = true)
public class ReadOnlyService<CLASS, ID> {

    protected CrudRepository<CLASS, ID> repository;

    public Page<CLASS> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public CLASS findById(ID id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found id: " + id));
    }
}
