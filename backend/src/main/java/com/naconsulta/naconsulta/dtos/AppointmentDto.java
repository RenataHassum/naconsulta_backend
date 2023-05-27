package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Appointment;
import com.naconsulta.naconsulta.entities.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class AppointmentDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Instant date;
    private String diagnosis;
    private String symptom;
    private Long userId;
    private Long doctorId;

    public AppointmentDto() {
    }

    public AppointmentDto(Long id, Instant date, String diagnosis, String symptom, Long userId, Long doctorId) {
        this.id = id;
        this.date = date;
        this.diagnosis = diagnosis;
        this.symptom = symptom;
        this.userId = userId;
        this.doctorId = doctorId;
    }

    public AppointmentDto(Appointment entity) {
        id = entity.getId();
        date = entity.getDate();
        diagnosis = entity.getDiagnosis();
        symptom = entity.getSymptom();
        userId = entity.getUser().getId();
        doctorId = entity.getDoctor().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }
}
