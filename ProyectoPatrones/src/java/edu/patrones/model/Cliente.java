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

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String clienteId;

    private String nombre;

    private String apepat;

    private String apemat;

    private String celular;

    private String nrodoc;

    private short estado;

    private String tipodocId;

    private String usuarioId;

    public Cliente() {
    }

    public Cliente(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNrodoc() {
        return nrodoc;
    }

    public void setNrodoc(String nrodoc) {
        this.nrodoc = nrodoc;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getTipodocId() {
        return tipodocId;
    }

    public void setTipodocId(String tipodocId) {
        this.tipodocId = tipodocId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.clienteId);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.clienteId, other.clienteId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clienteId=" + clienteId + ", nombre=" + nombre + ", apepat=" + apepat + ", apemat=" + apemat + ", celular=" + celular + ", nrodoc=" + nrodoc + ", estado=" + estado + ", tipodocId=" + tipodocId + ", usuarioId=" + usuarioId + '}';
    }
   
}
