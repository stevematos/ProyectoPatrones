/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando;

import edu.patrones.dao.impl.Conexion;
import edu.patrones.dao.impl.UsuarioDAOImpl;
import edu.patrones.service.impl.CanjeServiceImpl;
import edu.patrones.service.impl.CargoServiceImpl;
import edu.patrones.service.impl.UsuarioServiceImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Steve
 */
public class probando {
    public static void main(String[] args) throws Exception {
            CanjeServiceImpl dao=new CanjeServiceImpl();
            SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = dateformat3.parse("25/06/2018");
            System.out.println(dao.getCanjeFecha(date1));
    }
}
