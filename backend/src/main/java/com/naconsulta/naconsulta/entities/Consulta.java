package com.naconsulta.naconsulta.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_consulta")
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dataConsulta;

    @Column(columnDefinition = "TEXT")
    private String diagnostico;

    private String sintomas;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    public Consulta() {}

    public Consulta(Long id, Instant dataConsulta, String diagnostico, String sintomas, User user, Medico medico) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.diagnostico = diagnostico;
        this.sintomas = sintomas;
        this.user = user;
        this.medico = medico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consulta consulta)) return false;
        return Objects.equals(id, consulta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
