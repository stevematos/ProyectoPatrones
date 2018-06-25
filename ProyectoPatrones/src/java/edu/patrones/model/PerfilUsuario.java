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

public class PerfilUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String perfilId;

    private String nombre;

    private short estado;


    public PerfilUsuario() {
    }

    public PerfilUsuario(String perfilId) {
        this.perfilId = perfilId;
    }

    public String getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(String perfilId) {
        this.perfilId = perfilId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash = 41 * hash + Objects.hashCode(this.perfilId);
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
        final PerfilUsuario other = (PerfilUsuario) obj;
        if (!Objects.equals(this.perfilId, other.perfilId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PerfilUsuario{" + "perfilId=" + perfilId + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
}
