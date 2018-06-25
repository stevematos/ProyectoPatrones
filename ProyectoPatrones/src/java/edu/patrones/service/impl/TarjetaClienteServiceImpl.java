/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ITarjetaClienteDAO;
import edu.patrones.model.TarjetaCliente;
import edu.patrones.service.ITarjetaClienteService;
import java.io.Serializable;
import java.util.List;

public class TarjetaClienteServiceImpl implements ITarjetaClienteService, Serializable{

    private ITarjetaClienteDAO dao;
    
    @Override
    public void agregar(TarjetaCliente t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(TarjetaCliente t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<TarjetaCliente> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public TarjetaCliente listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}



