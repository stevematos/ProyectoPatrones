/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ITipoCanjeDAO;
import edu.patrones.dao.impl.TipoCanjeDAOImpl;
import edu.patrones.model.TipoCanje;
import edu.patrones.service.ITipoCanjeService;
import java.io.Serializable;
import java.util.List;

public class TipoCanjeServiceImpl implements ITipoCanjeService, Serializable{

    private ITipoCanjeDAO dao;

    public TipoCanjeServiceImpl() {
        dao=new TipoCanjeDAOImpl();
    }
    
    @Override
    public void agregar(TipoCanje t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(TipoCanje t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<TipoCanje> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public TipoCanje listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}



