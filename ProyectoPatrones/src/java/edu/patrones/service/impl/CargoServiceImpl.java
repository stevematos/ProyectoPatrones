/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ICargoDAO;
import edu.patrones.dao.impl.CargoDAOImpl;
import edu.patrones.model.Cargo;
import edu.patrones.service.ICargoService;
import java.io.Serializable;
import java.util.List;

public class CargoServiceImpl implements ICargoService, Serializable{

    private ICargoDAO dao;

    public CargoServiceImpl() {
        dao=new CargoDAOImpl();
    }
    
    @Override
    public void agregar(Cargo t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(Cargo t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<Cargo> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public Cargo listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}
