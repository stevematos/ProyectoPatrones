/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.ITipoDocumentoDAO;
import edu.patrones.model.TipoDocumento;
import edu.patrones.service.ITipoDocumentoService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author Jhunior Cuadros
 */
@Named
public class TipoDocumentoServiceImpl implements ITipoDocumentoService, Serializable{

    @EJB
    private ITipoDocumentoDAO dao;
    
    @Override
    public void agregar(TipoDocumento t) throws Exception {
        dao.agregar(t);
    }

    @Override
    public void eliminar(String id) throws Exception {
        dao.eliminar(id);
    }

    @Override
    public void actualizar(TipoDocumento t) throws Exception {
        dao.actualizar(t);
    }

    @Override
    public List<TipoDocumento> listar() throws Exception {
        return dao.listar();
    }

    @Override
    public TipoDocumento listarPorId(String id) throws Exception {
        return dao.listarPorId(id);
    }
    
}



