package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Telefone;
import com.naconsulta.naconsulta.entities.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TelefoneDto {

    private Long id;
    private String telefone;
    private Long userId;

    public TelefoneDto() {}

    public TelefoneDto(Long id, String telefone, Long userId) {
        this.id = id;
        this.telefone = telefone;
        this.userId = userId;
    }

    public TelefoneDto(Telefone entity) {
        this.id = entity.getId();
        this.telefone = entity.getTelefone();
        this.userId = entity.getUser().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
