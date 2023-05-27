package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Telephone;
import com.naconsulta.naconsulta.entities.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserFormDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private List<TelephoneDto> phones = new ArrayList<>();

    public UserFormDto() {}

    public UserFormDto(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UserFormDto(User entity) {
        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        email = entity.getEmail();
    }

    public UserFormDto(User entity, List<Telephone> phones) {
        this(entity);
        phones.forEach(phone -> this.phones.add(new TelephoneDto(phone)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TelephoneDto> getPhones() {
        return phones;
    }
}
