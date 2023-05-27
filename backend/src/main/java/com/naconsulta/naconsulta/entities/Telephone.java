package com.naconsulta.naconsulta.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_telephone")
public class Telephone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telephone;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Telephone() {}

    public Telephone(Long id, String telephone, User user) {
        this.id = id;
        this.telephone = telephone;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telephone telephone)) return false;
        return Objects.equals(getId(), telephone.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
