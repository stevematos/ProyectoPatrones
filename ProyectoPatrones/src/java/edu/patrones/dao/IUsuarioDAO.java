/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao;

import edu.patrones.model.Usuario;

public interface IUsuarioDAO extends IDAO<Usuario>{
    
    public Usuario ValidarUsuario(String nombre, String contraseña);
    
}
