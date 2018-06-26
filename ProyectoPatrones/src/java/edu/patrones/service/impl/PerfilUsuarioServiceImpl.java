/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IPerfilUsuarioDAO;
import edu.patrones.dao.impl.PerfilUsuarioDAOImpl;
import edu.patrones.model.PerfilUsuario;
import edu.patrones.service.IPerfilUsuarioService;
import java.io.Serializable;
import java.util.List;

public class PerfilUsuarioServiceImpl implements IPerfilUsuarioService, Serializable{

    private IPerfilUsuarioDAO dao;

    public PerfilUsuarioServiceImpl() {
        
        dao= new PerfilUsuarioDAOImpl();
    }
    
    
    
    @Override
    public void agregar(PerfilUsuario t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(PerfilUsuario t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<PerfilUsuario> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public PerfilUsuario listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}
