/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service;

import edu.patrones.model.Premio;
import java.util.List;

/**
 *
 * @author Jhunior Cuadros
 */
public interface IPremioService extends IService<Premio>{
    public List<Premio> getPremiosDisponibles();
}
