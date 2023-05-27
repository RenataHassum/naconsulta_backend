package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Address;
import com.naconsulta.naconsulta.entities.City;
import com.naconsulta.naconsulta.entities.State;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CityDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private StateDto state;

    Set<AddressDto> adresses = new HashSet<>();

    public CityDto() {}

    public CityDto(Long id, String name, StateDto state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public CityDto(City entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.state = new StateDto(entity.getState());
    }

    public CityDto(City entity, Set<Address> adresses) {
        this(entity);
        adresses.forEach(address -> this.adresses.add(new AddressDto(address)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StateDto getState() {
        return state;
    }

    public void setState(StateDto state) {
        this.state = state;
    }

    public Set<AddressDto> getAdresses() {
        return adresses;
    }
}
