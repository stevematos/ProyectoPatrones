/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.filterPattern;

import edu.patrones.model.Premio;
import java.util.List;

/**
 *
 * @author Steve
 */
public interface CriterioPremio {
    public List<Premio> DisponibilidadCriterioList(List<Premio> premios);
}
