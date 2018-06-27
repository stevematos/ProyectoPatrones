/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.filterPattern;

import edu.patrones.model.Premio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CriterioPremioDisponibilidad implements CriterioPremio{

    @Override
    public List<Premio> DisponibilidadCriterioList(List<Premio> premios) {
        List<Premio> aux=new ArrayList<>();
        for (Premio premio : premios) {
            if(Integer.parseInt(premio.getStock().trim())>0)
                aux.add(premio);
        }
        return aux;
    }
    
}
