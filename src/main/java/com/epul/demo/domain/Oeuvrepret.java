package com.epul.demo.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "oeuvrepret")
public class Oeuvrepret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oeuvrepret", nullable = false)
    private Integer id;

    @Column(name = "titre_oeuvrepret", nullable = false, length = 200)
    private String titreOeuvrepret;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proprietaire")
    private Proprietaire idProprietaire;

    @OneToMany(mappedBy = "idOeuvrepret")
    private Set<Emprunt> emprunts = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitreOeuvrepret() {
        return titreOeuvrepret;
    }

    public void setTitreOeuvrepret(String titreOeuvrepret) {
        this.titreOeuvrepret = titreOeuvrepret;
    }

    public Proprietaire getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(Proprietaire idProprietaire) {
        this.idProprietaire = idProprietaire;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

}