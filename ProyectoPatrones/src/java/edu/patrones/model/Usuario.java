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
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    private String usuarioId;

    private String nomUsuario;

    private String clveUsuario;

    private short estado;

    private String perfilId;

    public Usuario() {
    }

    public Usuario(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getClveUsuario() {
        return clveUsuario;
    }

    public void setClveUsuario(String clveUsuario) {
        this.clveUsuario = clveUsuario;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }


    public String getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(String perfilId) {
        this.perfilId = perfilId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.usuarioId);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuarioId, other.usuarioId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarioId=" + usuarioId + ", nomUsuario=" + nomUsuario + ", clveUsuario=" + clveUsuario + ", estado=" + estado + ", perfilId=" + perfilId + '}';
    }

}
