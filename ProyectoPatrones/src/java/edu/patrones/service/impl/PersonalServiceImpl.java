/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IPersonalDAO;
import edu.patrones.dao.impl.PersonalDAOImpl;
import edu.patrones.model.Personal;
import edu.patrones.service.IPersonalService;
import java.io.Serializable;
import java.util.List;

public class PersonalServiceImpl implements IPersonalService, Serializable{

    private IPersonalDAO dao;

    public PersonalServiceImpl() {
        dao=new PersonalDAOImpl();
    }
    
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


