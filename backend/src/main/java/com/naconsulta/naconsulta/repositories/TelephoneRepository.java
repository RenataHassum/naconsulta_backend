package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
}
