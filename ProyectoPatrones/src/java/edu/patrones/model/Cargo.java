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

public class Cargo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cargoId;

    private String descripcion;

    private short estado;

    public Cargo() {
    }

    public Cargo(String cargoId) {
        this.cargoId = cargoId;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
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
        hash = 29 * hash + Objects.hashCode(this.cargoId);
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
        final Cargo other = (Cargo) obj;
        if (!Objects.equals(this.cargoId, other.cargoId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cargo{" + "cargoId=" + cargoId + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
}
