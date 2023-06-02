package com.naconsulta.naconsulta.services;

import com.naconsulta.naconsulta.entities.Appointment;
import com.naconsulta.naconsulta.entities.User;
import com.naconsulta.naconsulta.repositories.AppointmentRepository;
import com.naconsulta.naconsulta.repositories.DoctorRepository;
import com.naconsulta.naconsulta.repositories.UserRepository;
import com.naconsulta.naconsulta.services.exceptions.ForbiddenException;
import com.naconsulta.naconsulta.services.exceptions.ResourceNotFoundException;
import com.naconsulta.naconsulta.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);
        } catch (Exception e) {
            throw new UnauthorizedException("Invalid user");
        }
    }

    public void validateSelf(Long userId) {
        User user = authenticated();
        if (!user.getId().equals(userId)) {
            throw new ForbiddenException("Access denied");
        }
    }

    public void validateSelfOrAdmin(Long userId) {
        User user = authenticated();
        System.out.println("E-mail do usuário autenticado: " + user.getEmail());
        if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
            throw new ForbiddenException("Access denied");
        }
    }

    public void validateAppointmentSelfOrAdmin(Long appointmentId) {
        User user = authenticated();
        Appointment appointment = appointmentRepository.getReferenceById(appointmentId);

        if (!user.getId().equals(appointment.getUser().getId()) && !user.hasRole("ROLE_ADMIN") && !user.getId().equals(appointment.getDoctor().getId())) {
            throw new ForbiddenException("Access denied!");
        }
    }

    public void validateAppointmentDoctor(Long appointmentId) {
        User user = authenticated();
        Appointment appointment = appointmentRepository.getReferenceById(appointmentId);

        if (!user.getId().equals(appointment.getDoctor().getId())) {
            throw new ForbiddenException("Access denied!");
        }
    }

    public void validateDeleteAccess(Long appointmentId) {
        User user = authenticated();
        Appointment appointment = appointmentRepository.findById(appointmentId).orElse(null);

        if (appointment == null) {
            throw new ResourceNotFoundException("Consulta não encontrada");
        }

        if (!user.getId().equals(appointment.getUser().getId())) {
            throw new ForbiddenException("Acesso negado");
        }
    }
}

