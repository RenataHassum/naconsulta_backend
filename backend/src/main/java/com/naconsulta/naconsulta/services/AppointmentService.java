package com.naconsulta.naconsulta.services;

import com.naconsulta.naconsulta.dtos.AppointmentDto;
import com.naconsulta.naconsulta.dtos.AppointmentMinDto;
import com.naconsulta.naconsulta.dtos.AppointmentUpdateDto;
import com.naconsulta.naconsulta.entities.Appointment;
import com.naconsulta.naconsulta.entities.Doctor;
import com.naconsulta.naconsulta.entities.User;
import com.naconsulta.naconsulta.repositories.AppointmentRepository;
import com.naconsulta.naconsulta.repositories.DoctorRepository;
import com.naconsulta.naconsulta.repositories.UserRepository;
import com.naconsulta.naconsulta.services.exceptions.DatabaseException;
import com.naconsulta.naconsulta.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    AuthService authService;

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        try {
            appointmentRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Recurso não encontrado");
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Falha de integridade referencial");
        }
    }

    @PreAuthorize("hasAnyRole('USER')")
    @Transactional(readOnly = true)
    public AppointmentDto findById(Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        authService.validateAppointmentSelfOrAdmin(id);

        return new AppointmentDto(appointment);
    }

    @PreAuthorize("hasAnyRole('USER')")
    @Transactional
    public AppointmentMinDto insert(AppointmentMinDto dto) {
        User user = authService.authenticated();
        Appointment entity = new Appointment();
        copyDtoToEntity(dto, entity);
        entity = appointmentRepository.save(entity);
        return new AppointmentMinDto(entity);
    }

    @PreAuthorize("hasAnyRole('DOCTOR')")
    @Transactional
    public void updateAppointment(Long id, AppointmentUpdateDto dto) {
        User user = authService.authenticated();
        Appointment appointment = appointmentRepository.getReferenceById(id);
        appointment.setDiagnosis(dto.getDiagnosis());
        appointment.setSymptom(dto.getSymptom());
        appointmentRepository.save(appointment);
        new AppointmentUpdateDto(appointment);
    }

    @Transactional(readOnly = true)
    public List<AppointmentDto> appointmentsLoggedUser() {
        User user = authService.authenticated();
        List<Appointment> list = appointmentRepository.findByUser(user);
        return list.stream().map(x -> new AppointmentDto(x)).collect(Collectors.toList());
    }

    private void copyDtoToEntity(AppointmentMinDto dto, Appointment entity) {
        entity.setDate(dto.getDate());
        User user = userRepository.getReferenceById(dto.getUserId());
        Doctor doctor = doctorRepository.getReferenceById(dto.getDoctorId());
        entity.setUser(user);
        entity.setDoctor(doctor);
    }
}
