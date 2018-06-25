/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Canje implements Serializable {

    private static final long serialVersionUID = 1L;

    private String canjeId;

    private String clienteId;

    private double costoTotal;

    private Date fechaCanje;

    private short estado;

    private String personalId;

    private String tipoCanje;

    public Canje() {
    }

    public Canje(String canjeId) {
        this.canjeId = canjeId;
    }

    public String getCanjeId() {
        return canjeId;
    }

    public void setCanjeId(String canjeId) {
        this.canjeId = canjeId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getFechaCanje() {
        return fechaCanje;
    }

    public void setFechaCanje(Date fechaCanje) {
        this.fechaCanje = fechaCanje;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getTipoCanje() {
        return tipoCanje;
    }

    public void setTipoCanje(String tipoCanje) {
        this.tipoCanje = tipoCanje;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.canjeId);
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
        final Canje other = (Canje) obj;
        if (!Objects.equals(this.canjeId, other.canjeId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Canje{" + "canjeId=" + canjeId + ", clienteId=" + clienteId + ", costoTotal=" + costoTotal + ", fechaCanje=" + fechaCanje + ", estado=" + estado + ", personalId=" + personalId + ", tipoCanje=" + tipoCanje + '}';
    }

   
}
