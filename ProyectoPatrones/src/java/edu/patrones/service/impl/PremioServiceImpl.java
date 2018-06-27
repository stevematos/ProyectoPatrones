/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IPremioDAO;
import edu.patrones.dao.impl.PremioDAOImpl;
import edu.patrones.filterPattern.CriterioPremio;
import edu.patrones.filterPattern.CriterioPremioDisponibilidad;
import edu.patrones.model.Premio;
import edu.patrones.service.IPremioService;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PremioServiceImpl implements IPremioService, Serializable{

    private IPremioDAO dao;

    public PremioServiceImpl() {
        dao=new PremioDAOImpl();
    }
    
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

    @Override
    public List<Premio> getPremiosDisponibles() {
        CriterioPremio criterio=new CriterioPremioDisponibilidad();
        try {
           return criterio.DisponibilidadCriterioList(dao.listar());
        } catch (Exception ex) {
            Logger.getLogger(PremioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}



