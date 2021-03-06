/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IClienteDAO;
import edu.patrones.dao.impl.ClienteDAOImpl;
import edu.patrones.model.Cliente;
import edu.patrones.service.IClienteService;
import java.io.Serializable;
import java.util.List;

public class ClienteServiceImpl implements IClienteService, Serializable{

    private IClienteDAO dao;

    public ClienteServiceImpl() {
        dao=new ClienteDAOImpl();
    }
    
    @Override
    public void agregar(Cliente t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Cliente t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Cliente> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Cliente listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}
