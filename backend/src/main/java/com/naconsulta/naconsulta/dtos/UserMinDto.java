package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.User;

import java.io.Serializable;

public class UserMinDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String email;

    public UserMinDto() {
    }

    public UserMinDto(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public UserMinDto(User entity) {
        id = entity.getId();
        email = entity.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
