package com.epul.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proprietaire")
public class Proprietaire {
    @Id
    @Column(name = "id_proprietaire", nullable = false)
    private Integer id;

    @Column(name = "nom_proprietaire", nullable = false, length = 100)
    private String nomProprietaire;

    @Column(name = "prenom_proprietaire", length = 100)
    private String prenomProprietaire;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

}