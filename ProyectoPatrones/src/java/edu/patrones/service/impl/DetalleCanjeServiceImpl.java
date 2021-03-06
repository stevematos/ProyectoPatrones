/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IDetalleCanjeDAO;
import edu.patrones.dao.impl.DetalleCanjeDAOImpl;
import edu.patrones.model.DetalleCanje;
import edu.patrones.service.IDetalleCanjeService;
import java.io.Serializable;
import java.util.List;

public class DetalleCanjeServiceImpl implements IDetalleCanjeService, Serializable{

    private IDetalleCanjeDAO dao;

    public DetalleCanjeServiceImpl() {
        dao=new DetalleCanjeDAOImpl();
    }
    
    @Override
    public void agregar(DetalleCanje t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(DetalleCanje t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<DetalleCanje> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public DetalleCanje listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}
