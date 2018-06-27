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

public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tarjetaId;

    private int ptsActuales;

    private int ptsAcumulados;

    private String numTarjeta;

    public Tarjeta() {
    }

    public Tarjeta(String tarjetaId) {
        this.tarjetaId = tarjetaId;
    }

    public String getTarjetaId() {
        return tarjetaId;
    }

    public void setTarjetaId(String tarjetaId) {
        this.tarjetaId = tarjetaId;
    }

    public int getPtsActuales() {
        return ptsActuales;
    }

    public void setPtsActuales(int ptsActuales) {
        this.ptsActuales = ptsActuales;
    }

    public int getPtsAcumulados() {
        return ptsAcumulados;
    }

    public void setPtsAcumulados(int ptsAcumulados) {
        this.ptsAcumulados = ptsAcumulados;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.tarjetaId);
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
        final Tarjeta other = (Tarjeta) obj;
        if (!Objects.equals(this.tarjetaId, other.tarjetaId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "tarjetaId=" + tarjetaId + ", ptsActuales=" + ptsActuales + ", ptsAcumulados=" + ptsAcumulados + ", numTarjeta=" + numTarjeta + '}';
    }

}
