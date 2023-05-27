package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Address;

import java.io.Serializable;

public class AddressDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String publicPlace;
    private String number;
    private String neighborhood;
    private Integer zipCode;
    private String room;
    private CityDto city;

    public AddressDto() {}

    public AddressDto(Long id, String publicPlace, String number, String neighborhood, Integer zipCode, String room, CityDto city) {
        this.id = id;
        this.publicPlace = publicPlace;
        this.number = number;
        this.neighborhood = neighborhood;
        this.zipCode = zipCode;
        this.room = room;
        this.city = city;
    }

    public AddressDto(Address entity) {
        this.id = entity.getId();
        this.publicPlace = entity.getPublicPlace();
        this.number = entity.getNumber();
        this.neighborhood = entity.getNeighborhood();
        this.zipCode = entity.getZipCode();
        this.room = entity.getRoom();
        this.city = new CityDto(entity.getCity());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }
}
