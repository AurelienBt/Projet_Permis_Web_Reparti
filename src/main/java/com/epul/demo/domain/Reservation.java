package com.epul.demo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservation")
public class Reservation {
    @EmbeddedId
    private ReservationId id;

    @javax.persistence.MapsId("idOeuvrevente")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_oeuvrevente", nullable = false)
    private Oeuvrevente idOeuvrevente;

    @javax.persistence.MapsId("idAdherent")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_adherent", nullable = false)
    private Adherent idAdherent;

    @Column(name = "date_reservation", nullable = false)
    private LocalDate dateReservation;

    @Column(name = "statut", nullable = false, length = 20)
    private String statut;

    public ReservationId getId() {
        return id;
    }

    public void setId(ReservationId id) {
        this.id = id;
    }

    public Oeuvrevente getIdOeuvrevente() {
        return idOeuvrevente;
    }

    public void setIdOeuvrevente(Oeuvrevente idOeuvrevente) {
        this.idOeuvrevente = idOeuvrevente;
    }

    public Adherent getIdAdherent() {
        return idAdherent;
    }

    public void setIdAdherent(Adherent idAdherent) {
        this.idAdherent = idAdherent;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

}