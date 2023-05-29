package com.naconsulta.naconsulta.services;

import com.naconsulta.naconsulta.dtos.UserFormDto;
import com.naconsulta.naconsulta.dtos.UserMaxDto;
import com.naconsulta.naconsulta.entities.User;
import com.naconsulta.naconsulta.repositories.UserRepository;
import com.naconsulta.naconsulta.services.exceptions.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public UserMaxDto userLogged() {
        User entity = authService.authenticated();
        return new UserMaxDto(entity, entity.getPhones(), entity.getRoles(), entity.getAppointments());
    }

    @Transactional(readOnly = true)
    public UserFormDto findById(Long id) {
        authService.validateSelfOrAdmin(id);
        Optional<User> obj = repository.findById(id);
        User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
        return new UserFormDto(entity, entity.getPhones());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByEmail(username);
        if (user == null) {
            logger.error("Usuário não encontrado " + username);
            throw new UsernameNotFoundException("Email não encontrado");
        }
        logger.info("Usuário encontrado " + username);
        return user;
    }
}

