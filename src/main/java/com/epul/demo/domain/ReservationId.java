package com.epul.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReservationId implements Serializable {
    private static final long serialVersionUID = -5392962435935703044L;
    @Column(name = "id_oeuvrevente", nullable = false)
    private Integer idOeuvrevente;

    @Column(name = "id_adherent", nullable = false)
    private Integer idAdherent;

    public Integer getIdOeuvrevente() {
        return idOeuvrevente;
    }

    public void setIdOeuvrevente(Integer idOeuvrevente) {
        this.idOeuvrevente = idOeuvrevente;
    }

    public Integer getIdAdherent() {
        return idAdherent;
    }

    public void setIdAdherent(Integer idAdherent) {
        this.idAdherent = idAdherent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || org.springframework.data.util.ProxyUtils.getUserClass(this) != org.springframework.data.util.ProxyUtils.getUserClass(o))
            return false;
        ReservationId entity = (ReservationId) o;
        return Objects.equals(this.idOeuvrevente, entity.idOeuvrevente) &&
                Objects.equals(this.idAdherent, entity.idAdherent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOeuvrevente, idAdherent);
    }

}