package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.SpecializationDto;
import com.naconsulta.naconsulta.services.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/specializations")
public class SpecializationController {

    @Autowired
    SpecializationService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<SpecializationDto> findById(@PathVariable Long id) {
        SpecializationDto dto = service.findbyId(id);
        return ResponseEntity.ok(dto);
    }


}
