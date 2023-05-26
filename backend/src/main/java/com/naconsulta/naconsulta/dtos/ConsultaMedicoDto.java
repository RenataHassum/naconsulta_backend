package com.naconsulta.naconsulta.dtos;

import com.naconsulta.naconsulta.entities.Consulta;

import java.io.Serializable;
import java.time.Instant;

public class ConsultaMedicoDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String diagnostico;
    private String sintoma;

    public ConsultaMedicoDto() {
    }

    public ConsultaMedicoDto(String diagnostico, String sintoma) {
        this.diagnostico = diagnostico;
        this.sintoma = sintoma;
    }

    public ConsultaMedicoDto(Consulta entity) {
        diagnostico = entity.getDiagnostico();
        sintoma = entity.getSintoma();
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

}
