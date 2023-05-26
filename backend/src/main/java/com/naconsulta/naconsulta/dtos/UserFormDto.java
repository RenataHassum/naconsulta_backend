package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Consulta;
import com.naconsulta.naconsulta.entities.Telefone;
import com.naconsulta.naconsulta.entities.User;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserFormDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String sobrenome;
    private String email;

    private List<TelefoneDto> telefones = new ArrayList<>();

    public UserFormDto() {}

    public UserFormDto(Long id, String nome, String sobrenome, String email) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public UserFormDto(User entity) {
        id = entity.getId();
        nome = entity.getNome();
        sobrenome = entity.getSobrenome();
        email = entity.getEmail();
    }

    public UserFormDto(User entity, List<Telefone> telefones) {
        this(entity);
        telefones.forEach(x -> this.telefones.add(new TelefoneDto(x)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TelefoneDto> getTelefones() {
        return telefones;
    }
}
