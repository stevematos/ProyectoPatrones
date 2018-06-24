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

public class TarjetaCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tarclienteId;

    private String clienteId;

    private String tarjetaId;

    public TarjetaCliente() {
    }

    public TarjetaCliente(String tarclienteId) {
        this.tarclienteId = tarclienteId;
    }

    public String getTarclienteId() {
        return tarclienteId;
    }

    public void setTarclienteId(String tarclienteId) {
        this.tarclienteId = tarclienteId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getTarjetaId() {
        return tarjetaId;
    }

    public void setTarjetaId(String tarjetaId) {
        this.tarjetaId = tarjetaId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.tarclienteId);
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
        final TarjetaCliente other = (TarjetaCliente) obj;
        if (!Objects.equals(this.tarclienteId, other.tarclienteId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tarjetacliente{" + "tarclienteId=" + tarclienteId + ", clienteId=" + clienteId + ", tarjetaId=" + tarjetaId + '}';
    }

    
}
