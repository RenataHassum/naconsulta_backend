package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Consulta;
import com.naconsulta.naconsulta.entities.Medico;
import com.naconsulta.naconsulta.entities.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.Instant;

public class ConsultaDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Instant dataConsulta;
    private String diagnostico;
    private String sintoma;
    private Long userId;
    private Long medicoId;

    public ConsultaDto() {
    }

    public ConsultaDto(Long id, Instant dataConsulta, String diagnostico, String sintoma, Long userId, Long medicoId) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.diagnostico = diagnostico;
        this.sintoma = sintoma;
        this.userId = userId;
        this.medicoId = medicoId;
    }

    public ConsultaDto(Consulta entity) {
        id = entity.getId();
        dataConsulta = entity.getDataConsulta();
        diagnostico = entity.getDiagnostico();
        sintoma = entity.getSintoma();
        userId = entity.getUser().getId();
        medicoId = entity.getMedico().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Instant dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }
}
