package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Appointment;
import com.naconsulta.naconsulta.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByUser(User user);
}
