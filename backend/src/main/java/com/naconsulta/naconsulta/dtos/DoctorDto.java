package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Appointment;
import com.naconsulta.naconsulta.entities.Doctor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DoctorDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String firstName;
    private String lastName;
    private Double appointmentPrice;
    private boolean insurance;
    private Double evaluation;
    private String specialization;
    private AddressMinDto address;
    private List<AppointmentDto> appointments = new ArrayList<>();

    public DoctorDto(Long id, String firstName, String lastName, Double appointmentPrice, boolean insurance, Double evaluation, String specialization, AddressMinDto address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.appointmentPrice = appointmentPrice;
        this.insurance = insurance;
        this.evaluation = evaluation;
        this.specialization = specialization;
        this.address = address;
    }

    public DoctorDto(Doctor entity) {
        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        appointmentPrice = entity.getAppointmentPrice();
        insurance = entity.isInsurance();
        evaluation = entity.getEvaluation();
        specialization = entity.getSpecialization().getName();
        address = new AddressMinDto(entity.getAddress());
    }

    public DoctorDto(Doctor entity, List<Appointment> appointments) {
        this(entity);
        appointments.forEach(appointment -> this.appointments.add(new AppointmentDto(appointment)));
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

    public Double getAppointmentPrice() {
        return appointmentPrice;
    }

    public void setAppointmentPrice(Double appointmentPrice) {
        this.appointmentPrice = appointmentPrice;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public Double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Double evaluation) {
        this.evaluation = evaluation;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public AddressMinDto getAddress() {
        return address;
    }

    public void setAddress(AddressMinDto address) {
        this.address = address;
    }

    public List<AppointmentDto> getAppointments() {
        return appointments;
    }
}
