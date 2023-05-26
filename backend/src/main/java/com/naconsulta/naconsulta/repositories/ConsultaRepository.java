package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Consulta;
import com.naconsulta.naconsulta.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByUser(User user);
}
