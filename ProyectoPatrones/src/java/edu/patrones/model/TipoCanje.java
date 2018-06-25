/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jhunior Cuadros
 */

public class TipoCanje implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tipocanjeId;

    private String descripcion;

    private short estado;


    public TipoCanje() {
    }

    public TipoCanje(String tipocanjeId) {
        this.tipocanjeId = tipocanjeId;
    }

    public String getTipocanjeId() {
        return tipocanjeId;
    }

    public void setTipocanjeId(String tipocanjeId) {
        this.tipocanjeId = tipocanjeId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.tipocanjeId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoCanje other = (TipoCanje) obj;
        if (!Objects.equals(this.tipocanjeId, other.tipocanjeId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoCanje{" + "tipocanjeId=" + tipocanjeId + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }

}
