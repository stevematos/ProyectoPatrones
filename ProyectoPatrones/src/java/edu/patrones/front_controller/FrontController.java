/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.front_controller;

import edu.patrones.dao.IUsuarioDAO;
import edu.patrones.dao.impl.UsuarioDAOImpl;
import edu.patrones.model.Usuario;

/**
 *
 * @author Jhunior Cuadros
 */
public class FrontController {

    private Dispatcher dispatcher;
    private IUsuarioDAO dao;

    public FrontController() {
        dispatcher = new Dispatcher();
        dao = new UsuarioDAOImpl();
    }

    private String isAuthenticUser(String nombre,String contrasenia) {
        Usuario musu = dao.ValidarUsuario(nombre, contrasenia);
        String codigo=null;
        System.out.println(musu.getUsuarioId());
        if(musu.getUsuarioId()!=null)
            codigo = musu.getPerfilId().trim();
        return codigo;
    }

    public String dispatchRequest(String nombre,String contrasenia) {
        //autentificar usuaria
        String codigo=isAuthenticUser(nombre,contrasenia);
        String direccion="jsp/login.jsp";
        if (codigo!=null) 
            direccion=dispatcher.dispatch(codigo);
        return direccion;
    }
}
