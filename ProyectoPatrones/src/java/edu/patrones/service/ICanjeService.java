/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.service;

import edu.patrones.model.Canje;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jhunior Cuadros
 */
public interface ICanjeService extends IService<Canje>{
    
    public List<Canje> getCanjeFecha(Date fecha) throws Exception;
}
