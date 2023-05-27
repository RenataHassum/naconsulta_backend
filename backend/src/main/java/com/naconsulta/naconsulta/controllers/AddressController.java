package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.AddressDto;
import com.naconsulta.naconsulta.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/adresses")
public class AddressController {

    @Autowired
    AddressService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AddressDto> findById(@PathVariable Long id) {
        AddressDto dto = service.findbyId(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<AddressDto>> findAll() {
        List<AddressDto> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }

}
