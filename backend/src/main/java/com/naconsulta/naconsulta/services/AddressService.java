package com.naconsulta.naconsulta.services;

import com.naconsulta.naconsulta.dtos.AddressDto;
import com.naconsulta.naconsulta.entities.Address;
import com.naconsulta.naconsulta.repositories.AddressRepository;
import com.naconsulta.naconsulta.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressService {

    @Autowired
    AddressRepository repository;

    @Transactional(readOnly = true)
    public AddressDto findbyId(Long id) {
        Address entity = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new AddressDto(entity);
    }

    @Transactional(readOnly = true)
    public List<AddressDto> findAll() {
        List<Address> result = repository.findAll();
        return result.stream().map(x -> new AddressDto(x)).collect(Collectors.toList());
    }
}
