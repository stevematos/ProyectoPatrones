/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ITarjetaDAO;
import edu.patrones.model.Tarjeta;
import edu.patrones.service.ITarjetaService;
import java.io.Serializable;
import java.util.List;

public class TarjetaServiceImpl implements ITarjetaService, Serializable{

    private ITarjetaDAO dao;
    
    @Override
    public void agregar(Tarjeta t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Tarjeta t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Tarjeta> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Tarjeta listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}



