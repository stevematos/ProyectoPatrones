/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IPersonalDAO;
import edu.patrones.model.Personal;
import edu.patrones.service.IPersonalService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author Jhunior Cuadros
 */
@Named
public class PersonalServiceImpl implements IPersonalService, Serializable{

    @EJB
    private IPersonalDAO dao;
    
    @Override
    public void agregar(Personal t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Personal t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Personal> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Personal listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}


