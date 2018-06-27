/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletSteve;

import edu.patrones.service.impl.CanjeServiceImpl;
import edu.patrones.service.impl.PremioServiceImpl;
import edu.patrones.service.impl.ProveedorServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Steve
 */
public class ServletVerProductosCanje extends HttpServlet {
    PremioServiceImpl dao=new PremioServiceImpl();
    ProveedorServiceImpl daoProveedor=new ProveedorServiceImpl();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getSession().setAttribute("premios",dao.getPremiosDisponibles());
        try {
            request.getSession().setAttribute("proveedores", daoProveedor.listar());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        response.sendRedirect(request.getContextPath() + "/jsp/VerProductosCanje.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    

}
