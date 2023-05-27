package com.naconsulta.naconsulta.repositories;

import com.naconsulta.naconsulta.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
