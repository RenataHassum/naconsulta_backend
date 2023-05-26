package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.ConsultaDto;
import com.naconsulta.naconsulta.dtos.ConsultaMedicoDto;
import com.naconsulta.naconsulta.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @PutMapping(value = "/{id}")
    public ResponseEntity<ConsultaMedicoDto> updateConsulta(@PathVariable Long id, @RequestBody ConsultaMedicoDto dto) {
        service.updateConsulta(id, dto);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<ConsultaDto>> consultasUsuarioLogado() {
        List<ConsultaDto> list = service.consultasUsuarioLogado();
        return ResponseEntity.ok().body(list);
    }
}
