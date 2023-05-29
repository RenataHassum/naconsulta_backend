package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Telephone;

public class TelephoneDto {

    private Long id;
    private String telephone;

    public TelephoneDto() {
    }

    public TelephoneDto(Long id, String telephone) {
        this.id = id;
        this.telephone = telephone;
    }

    public TelephoneDto(Telephone entity) {
        id = entity.getId();
        telephone = entity.getTelephone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
