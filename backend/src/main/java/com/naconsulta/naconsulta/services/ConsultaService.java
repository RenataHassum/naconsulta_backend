package com.naconsulta.naconsulta.services;

import com.naconsulta.naconsulta.dtos.ConsultaDto;
import com.naconsulta.naconsulta.dtos.ConsultaMedicoDto;
import com.naconsulta.naconsulta.entities.Consulta;
import com.naconsulta.naconsulta.entities.User;
import com.naconsulta.naconsulta.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepository repository;

    @Autowired
    AuthService authService;

    @PreAuthorize("hasAnyRole('MEDICO')")
    @Transactional
    public void updateConsulta(Long id, ConsultaMedicoDto dto) {
        Consulta consulta = repository.getReferenceById(id);
        consulta.setDiagnostico(dto.getDiagnostico());
        consulta.setSintoma(dto.getSintoma());
        repository.save(consulta);
    }

    @Transactional(readOnly = true)
    public List<ConsultaDto> consultasUsuarioLogado() {
        User user = authService.authenticated();
        List<Consulta> list = repository.findByUser(user);
        return list.stream().map(x -> new ConsultaDto(x)).collect(Collectors.toList());
    }
}
