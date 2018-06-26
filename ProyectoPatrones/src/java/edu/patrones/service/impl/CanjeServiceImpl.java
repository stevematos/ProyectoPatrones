/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ICanjeDAO;
import edu.patrones.dao.impl.CanjeDAOImpl;
import edu.patrones.model.Canje;
import edu.patrones.service.ICanjeService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CanjeServiceImpl implements ICanjeService, Serializable{

    private ICanjeDAO dao;

    public CanjeServiceImpl() {
        dao=new CanjeDAOImpl();
    }
    
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

    @Override
    public List<Canje> getCanjeFecha(Date fecha) throws Exception {
        System.out.println(fecha);
        java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
        System.out.println(fechaSql);
        return dao.listarPorFecha(fechaSql);
    }
    
    
}
