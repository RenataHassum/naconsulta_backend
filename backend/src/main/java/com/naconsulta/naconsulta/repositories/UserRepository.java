package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}