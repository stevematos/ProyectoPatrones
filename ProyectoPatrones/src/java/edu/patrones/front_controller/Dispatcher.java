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
public class Dispatcher {
    
    
    private final String ventas= "jsp/vistamenu_ventas.jsp";
    private final String canje="jsp/vistamenu_canje.jsp";
    private final String admin="jsp/vistamenu_admin.jsp";
    public Dispatcher() {
    }
    
    public String dispatch(String codigo){
        String respuesta = "";
        switch (codigo){
            case "2": respuesta= ventas; break;
            case "3": respuesta= canje; break;
            case "4": respuesta= admin; break;
        }
        return respuesta;
   }  
    
        
    
}
