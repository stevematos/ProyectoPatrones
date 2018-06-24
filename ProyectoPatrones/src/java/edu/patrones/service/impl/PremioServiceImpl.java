/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IPremioDAO;
import edu.patrones.model.Premio;
import edu.patrones.service.IPremioService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author Jhunior Cuadros
 */
@Named
public class PremioServiceImpl implements IPremioService, Serializable{

    @EJB
    private IPremioDAO dao;
    
    @Override
    public void agregar(Premio t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Premio t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Premio> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Premio listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}



