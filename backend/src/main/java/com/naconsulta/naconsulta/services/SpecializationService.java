package com.naconsulta.naconsulta.services;

import com.naconsulta.naconsulta.dtos.SpecializationDto;
import com.naconsulta.naconsulta.entities.Specialization;
import com.naconsulta.naconsulta.repositories.SpecializationRepository;
import com.naconsulta.naconsulta.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpecializationService {

    @Autowired
    SpecializationRepository repository;

    @Transactional(readOnly = true)
    public SpecializationDto findbyId(Long id) {
        Specialization entity = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new SpecializationDto(entity, entity.getDoctors());
    }
}
