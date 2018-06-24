/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.controller;

import edu.patrones.model.Canje;
import edu.patrones.service.ICanjeService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Jhunior Cuadros
 */
@Named
@ViewScoped
public class CanjeBean implements Serializable {

    @Inject
    private ICanjeService canjeService;
    @Inject
    private Canje canje;
    private String accion;
    private List<Canje> canjeList;

    @PostConstruct
    public void init() {
        this.listar();
        accion = "Registrar";
    }

    public void seleccionar(Canje c) throws Exception {

        canje = canjeService.listarPorId(c.getCanjeId());
        accion = "Modificar";

    }

    public void operar() {
        try {

            if ("0".equals(canje.getCanjeId())) {
                canjeService.agregar(canje);
            } else {
                canjeService.actualizar(canje);
            }
            this.listar();

        } catch (Exception e) {

        }
    }

    public void listar() {
        try {
            canjeList = canjeService.listar();
        } catch (Exception e) {

        }

    }

    public void limpiarControles() {
        this.canje.setCanjeId(null);
        this.canje.setClienteId(null);
        this.canje.setTipoCanje(null);
        this.canje.setPersonalId(null);
        this.canje.setCostoTotal(0);
        this.canje.setFechaCanje(null);
        this.canje.setEstado((short)0);
        accion = "Registrar";

    }

    public Canje getCanje() {
        return canje;
    }

    public void setCanje(Canje canje) {
        this.canje = canje;
    }

    public List<Canje> getCanjeList() {
        return canjeList;
    }

    public void setCanjeList(List<Canje> canjeList) {
        this.canjeList = canjeList;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

}
