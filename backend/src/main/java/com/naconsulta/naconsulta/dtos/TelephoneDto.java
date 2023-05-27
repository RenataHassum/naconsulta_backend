package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Telephone;

public class TelephoneDto {

    private Long id;
    private String telephone;
    private Long userId;

    public TelephoneDto() {}

    public TelephoneDto(Long id, String telephone, Long userId) {
        this.id = id;
        this.telephone = telephone;
        this.userId = userId;
    }

    public TelephoneDto(Telephone entity) {
        id = entity.getId();
        telephone = entity.getTelephone();
        userId = entity.getUser().getId();
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
