/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service;

import java.util.List;

/**
 *
 * @author Jhunior Cuadros
 * @param <T>
 */
public interface IService<T> {

    public void agregar(T t) throws Exception;

    public void eliminar(String id) throws Exception;

    public void actualizar(T t) throws Exception;
    
    public List<T> listar() throws Exception;

    public T listarPorId(String id) throws Exception;
    
}
