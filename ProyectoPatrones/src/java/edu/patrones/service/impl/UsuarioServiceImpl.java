/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IUsuarioDAO;
import edu.patrones.model.Usuario;
import edu.patrones.service.IUsuarioService;
import java.io.Serializable;
import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService, Serializable{

    private IUsuarioDAO dao;
    
    @Override
    public void agregar(Usuario t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Usuario t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Usuario> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Usuario listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}



