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
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;

    private String proveedorId;

    private String ruc;

    private String nombre;

    private String direccion;

    private String telefono;

    private String paginaWeb;

    public Proveedor() {
    }

    public Proveedor(String proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(String proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.proveedorId);
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
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.proveedorId, other.proveedorId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "proveedorId=" + proveedorId + ", ruc=" + ruc + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", paginaWeb=" + paginaWeb + '}';
    }

}
