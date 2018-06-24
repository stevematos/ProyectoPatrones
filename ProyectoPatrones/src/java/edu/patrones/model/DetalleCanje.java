/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jhunior Cuadros
 */
public class DetalleCanje implements Serializable {

    private static final long serialVersionUID = 1L;

    private String detalleId;

    private short estadoId;

    private String canjeId;

    private String premioId;

    public DetalleCanje() {
    }

    public DetalleCanje(String detalleId) {
        this.detalleId = detalleId;
    }

    public String getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(String detalleId) {
        this.detalleId = detalleId;
    }

    public short getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(short estadoId) {
        this.estadoId = estadoId;
    }

    public String getPremioId() {
        return canjeId;
    }

    public void setPremioId(String canjeId) {
        this.canjeId = canjeId;
    }

    public String getCanjeId() {
        return premioId;
    }

    public void setCanjeId(String premioId) {
        this.premioId = premioId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.detalleId);
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
        final DetalleCanje other = (DetalleCanje) obj;
        if (!Objects.equals(this.detalleId, other.detalleId)) {
            return false;
        }
        return true;
    }

    
}
