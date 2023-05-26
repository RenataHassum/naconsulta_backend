package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}
