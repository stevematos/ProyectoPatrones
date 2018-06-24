/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ICanjeDAO;
import edu.patrones.model.Canje;
import edu.patrones.service.ICanjeService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author Jhunior Cuadros
 */
@Named
public class CanjeServiceImpl implements ICanjeService, Serializable{

    @EJB
    private ICanjeDAO dao;
    
    @Override
    public void agregar(Canje t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Canje t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Canje> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Canje listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}
