/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao;

import edu.patrones.model.Canje;
import java.sql.Date;
import java.util.List;

public interface ICanjeDAO extends IDAO<Canje>{
    public List<Canje> listarPorFecha(Date fecha);
}
