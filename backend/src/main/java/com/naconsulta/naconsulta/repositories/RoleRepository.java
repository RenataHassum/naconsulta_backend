package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Role;
import com.naconsulta.naconsulta.entities.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
