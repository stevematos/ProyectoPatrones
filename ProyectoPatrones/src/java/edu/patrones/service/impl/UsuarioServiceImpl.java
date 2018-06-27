/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service.impl;

import edu.patrones.dao.IUsuarioDAO;
import edu.patrones.dao.impl.UsuarioDAOImpl;
import edu.patrones.model.Usuario;
import edu.patrones.service.IUsuarioService;
import java.io.Serializable;
import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService, Serializable {

    private IUsuarioDAO dao;

    public UsuarioServiceImpl() {
        dao = new UsuarioDAOImpl();
    }

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

    public String validarUsuario(String nombre, String contraseña) {
        String respuesta = "";

        Usuario musu = new Usuario();
        musu = dao.ValidarUsuario(nombre, contraseña);
        System.out.println("perfil: " + musu.getPerfilId());
        String codigo = musu.getPerfilId().trim();

        if (codigo.equalsIgnoreCase("2")) {
            respuesta = "jsp/vistamenu_ventas.jsp";

        } else if (codigo.equalsIgnoreCase("3")) {
            respuesta = "jsp/vistamenu_canje.jsp";
        }else if (codigo.equalsIgnoreCase("4")) {
            respuesta = "jsp/vistamenu_admin.jsp";
        }
        return respuesta;
    }
    
    public Usuario listarPorNom(String nombre, String contraseña){
        Usuario musuario = new Usuario();
        
        musuario = dao.ValidarUsuario(nombre, contraseña);
        
        return musuario;
    }
    
    public Integer obtenerId(){
        Integer cantidad = dao.contarRegistros();
        Integer id = cantidad+1;
        return id;
    }

}
