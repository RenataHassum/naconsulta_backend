package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.UserFormDto;
import com.naconsulta.naconsulta.dtos.UserInsertDto;
import com.naconsulta.naconsulta.dtos.UserMaxDto;
import com.naconsulta.naconsulta.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserFormDto> insert(@Valid @RequestBody UserInsertDto dto) {
        UserFormDto newDto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDto.getId()).toUri();
        return ResponseEntity.created(uri).body(newDto);
    }

    @GetMapping(value = "/profile")
    public ResponseEntity<UserMaxDto> userLogged() {
        UserMaxDto dto = service.userLogged();
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserFormDto> findById(@PathVariable Long id) {
        UserFormDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }
}
