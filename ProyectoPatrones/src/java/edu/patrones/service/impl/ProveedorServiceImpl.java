/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IProveedorDAO;
import edu.patrones.dao.impl.ProveedorDAOImpl;
import edu.patrones.model.Proveedor;
import edu.patrones.service.IProveedorService;
import java.io.Serializable;
import java.util.List;

public class ProveedorServiceImpl implements IProveedorService, Serializable{

    private IProveedorDAO dao;

    public ProveedorServiceImpl() {
        dao=new ProveedorDAOImpl();
    }
    
    @Override
    public void agregar(Proveedor t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Proveedor t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Proveedor> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Proveedor listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}



