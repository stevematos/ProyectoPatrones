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
import edu.patrones.service.impl.PremioServiceImpl;
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
            UsuarioServiceImpl dao=new UsuarioServiceImpl();
            System.out.println(dao.listar());
    }
}
