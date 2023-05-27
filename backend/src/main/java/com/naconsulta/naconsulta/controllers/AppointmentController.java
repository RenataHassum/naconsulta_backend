package com.naconsulta.naconsulta.controllers;

import com.naconsulta.naconsulta.dtos.AppointmentDto;
import com.naconsulta.naconsulta.dtos.AppointmentUpdateDto;
import com.naconsulta.naconsulta.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PutMapping(value = "/{id}")
    public ResponseEntity<AppointmentUpdateDto> updateAppointment(@PathVariable Long id, @RequestBody AppointmentUpdateDto dto) {
        service.updateAppointment(id, dto);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> appointmentsLoggedUser() {
        List<AppointmentDto> list = service.appointmentsLoggedUser();
        return ResponseEntity.ok().body(list);
    }
}
