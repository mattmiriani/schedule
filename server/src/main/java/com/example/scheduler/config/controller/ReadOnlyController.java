package com.example.scheduler.config.controller;

import com.example.scheduler.config.service.CrudService;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Setter
public class ReadOnlyController<CLASS, ID> {

    private CrudService<CLASS, ID> service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<CLASS>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<CLASS> findById(@RequestParam("id") ID id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
