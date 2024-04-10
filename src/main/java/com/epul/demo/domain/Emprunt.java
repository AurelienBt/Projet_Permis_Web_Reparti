package com.epul.demo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @Column(name = "id_emprunt", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_adherent")
    private Adherent idAdherent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_oeuvrepret")
    private Oeuvrepret idOeuvrepret;

    @Column(name = "date_emprunt")
    private LocalDate dateEmprunt;

    @Column(name = "date_retour")
    private LocalDate dateRetour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Adherent getIdAdherent() {
        return idAdherent;
    }

    public void setIdAdherent(Adherent idAdherent) {
        this.idAdherent = idAdherent;
    }

    public Oeuvrepret getIdOeuvrepret() {
        return idOeuvrepret;
    }

    public void setIdOeuvrepret(Oeuvrepret idOeuvrepret) {
        this.idOeuvrepret = idOeuvrepret;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

}