package com.epul.demo.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "adherent")
public class Adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adherent", nullable = false)
    private Integer id;

    @Column(name = "nom_adherent", nullable = false, length = 100)
    private String nomAdherent;

    @Column(name = "prenom_adherent", length = 100)
    private String prenomAdherent;

    @Column(name = "ville_adherent", length = 100)
    private String villeAdherent;

    @OneToMany(mappedBy = "idAdherent")
    private Set<Emprunt> emprunts = new LinkedHashSet<>();



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomAdherent() {
        return nomAdherent;
    }

    public void setNomAdherent(String nomAdherent) {
        this.nomAdherent = nomAdherent;
    }

    public String getPrenomAdherent() {
        return prenomAdherent;
    }

    public void setPrenomAdherent(String prenomAdherent) {
        this.prenomAdherent = prenomAdherent;
    }

    public String getVilleAdherent() {
        return villeAdherent;
    }

    public void setVilleAdherent(String villeAdherent) {
        this.villeAdherent = villeAdherent;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

   
}