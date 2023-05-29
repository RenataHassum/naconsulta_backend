package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.AddressMinDto;
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
    public ResponseEntity<AddressMinDto> findById(@PathVariable Long id) {
        AddressMinDto dto = service.findbyId(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<AddressMinDto>> findAllOrByNeighborhood(@RequestParam(name = "name", defaultValue = "") String name) {
        List<AddressMinDto> dto = service.findByNeighborhood(name);
        return ResponseEntity.ok(dto);
    }

}
