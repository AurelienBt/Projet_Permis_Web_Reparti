package com.epul.demo.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "oeuvrevente")
public class Oeuvrevente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oeuvrevente", insertable = false, updatable = false, nullable = false)
    private Integer id;

    @Column(name = "titre_oeuvrevente", nullable = false, length = 200)
    private String titreOeuvrevente;

    @Column(name = "etat_oeuvrevente", nullable = false, length = 1)
    private String etatOeuvrevente;

    @Column(name = "prix_oeuvrevente", nullable = false)
    private Float prixOeuvrevente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proprietaire")
    private Proprietaire idProprietaire;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitreOeuvrevente() {
        return titreOeuvrevente;
    }

    public void setTitreOeuvrevente(String titreOeuvrevente) {
        this.titreOeuvrevente = titreOeuvrevente;
    }

    public String getEtatOeuvrevente() {
        return etatOeuvrevente;
    }

    public void setEtatOeuvrevente(String etatOeuvrevente) {
        this.etatOeuvrevente = etatOeuvrevente;
    }

    public Float getPrixOeuvrevente() {
        return prixOeuvrevente;
    }

    public void setPrixOeuvrevente(Float prixOeuvrevente) {
        this.prixOeuvrevente = prixOeuvrevente;
    }

    public Proprietaire getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(Proprietaire idProprietaire) {
        this.idProprietaire = idProprietaire;
    }


}