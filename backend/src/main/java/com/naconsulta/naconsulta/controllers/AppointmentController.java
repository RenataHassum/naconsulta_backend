package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.AppointmentDto;
import com.naconsulta.naconsulta.dtos.AppointmentMinDto;
import com.naconsulta.naconsulta.dtos.AppointmentUpdateDto;
import com.naconsulta.naconsulta.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AppointmentDto> findById(@PathVariable Long id) {
        AppointmentDto dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<AppointmentMinDto> insert(@Valid @RequestBody AppointmentMinDto dto) {
        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> updateAppointment(@PathVariable Long id, @Valid @RequestBody AppointmentUpdateDto dto) {
        service.updateAppointment(id, dto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> appointmentsLoggedUser() {
        List<AppointmentDto> list = service.appointmentsLoggedUser();
        return ResponseEntity.ok().body(list);
    }
}
