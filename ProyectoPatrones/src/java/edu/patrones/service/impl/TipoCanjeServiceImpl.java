/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ITipoCanjeDAO;
import edu.patrones.model.TipoCanje;
import edu.patrones.service.ITipoCanjeService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author Jhunior Cuadros
 */
@Named
public class TipoCanjeServiceImpl implements ITipoCanjeService, Serializable{

    @EJB
    private ITipoCanjeDAO dao;
    
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



