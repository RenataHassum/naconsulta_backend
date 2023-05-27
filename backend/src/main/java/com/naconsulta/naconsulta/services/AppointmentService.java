package com.naconsulta.naconsulta.services;

import com.naconsulta.naconsulta.dtos.AppointmentDto;
import com.naconsulta.naconsulta.dtos.AppointmentUpdateDto;
import com.naconsulta.naconsulta.entities.Appointment;
import com.naconsulta.naconsulta.entities.User;
import com.naconsulta.naconsulta.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository repository;

    @Autowired
    AuthService authService;

    @PreAuthorize("hasAnyRole('DOCTOR')")
    @Transactional
    public AppointmentUpdateDto updateAppointment(Long id, AppointmentUpdateDto dto) {
        Appointment appointment = repository.getReferenceById(id);
        appointment.setDiagnosis(dto.getDiagnosis());
        appointment.setSymptom(dto.getSymptom());
        repository.save(appointment);
        return new AppointmentUpdateDto(appointment);
    }

    @Transactional(readOnly = true)
    public List<AppointmentDto> appointmentsLoggedUser() {
        User user = authService.authenticated();
        List<Appointment> list = repository.findByUser(user);
        return list.stream().map(x -> new AppointmentDto(x)).collect(Collectors.toList());
    }
}
