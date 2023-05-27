package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
