package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
