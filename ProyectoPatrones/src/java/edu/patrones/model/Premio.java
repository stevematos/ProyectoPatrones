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

public class Premio implements Serializable {

    private static final long serialVersionUID = 1L;

    private String premioId;

    private String nombre;

    private String costoPuntos;

    private String stock;

    private String imagen;

    private String observacion;

    private String proveedorId;

    public Premio() {
    }

    public Premio(String premioId) {
        this.premioId = premioId;
    }

    public String getPremioId() {
        return premioId;
    }

    public void setPremioId(String premioId) {
        this.premioId = premioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCostoPuntos() {
        return costoPuntos;
    }

    public void setCostoPuntos(String costoPuntos) {
        this.costoPuntos = costoPuntos;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(String proveedorId) {
        this.proveedorId = proveedorId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.premioId);
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
        final Premio other = (Premio) obj;
        if (!Objects.equals(this.premioId, other.premioId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Premio{" + "premioId=" + premioId + ", nombre=" + nombre + ", costoPuntos=" + costoPuntos + ", stock=" + stock + ", imagen=" + imagen + ", observacion=" + observacion + ", proveedorId=" + proveedorId + '}';
    }


}
