package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.UserFormDto;
import com.naconsulta.naconsulta.dtos.UserMaxDto;
import com.naconsulta.naconsulta.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

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
