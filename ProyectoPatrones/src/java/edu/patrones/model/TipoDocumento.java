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

public class TipoDocumento implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tipodocId;

    private String descripcion;

    private short estado;


    public TipoDocumento() {
    }

    public TipoDocumento(String tipodocId) {
        this.tipodocId = tipodocId;
    }

    public String getTipodocId() {
        return tipodocId;
    }

    public void setTipodocId(String tipodocId) {
        this.tipodocId = tipodocId;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tipodocId);
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
        final TipoDocumento other = (TipoDocumento) obj;
        if (!Objects.equals(this.tipodocId, other.tipodocId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" + "tipodocId=" + tipodocId + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
}
