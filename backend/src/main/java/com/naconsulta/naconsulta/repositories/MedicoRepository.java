package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
