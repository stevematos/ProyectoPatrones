/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletSteve;

import edu.patrones.model.Premio;
import edu.patrones.service.impl.PremioServiceImpl;
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
public class ServletModificarCanje extends HttpServlet {
    
    PremioServiceImpl service=new PremioServiceImpl();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Premio premio=null;
        try {
           premio=service.listarPorId(request.getParameter("id"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        request.getSession().setAttribute("premioEditar", premio);
        response.sendRedirect(request.getContextPath() + "/jsp/ModificarCanje.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Premio premio=(Premio)request.getSession().getAttribute("premioEditar");
        if(premio!=null){
            premio.setCostoPuntos(request.getParameter("puntos-producto"));
            premio.setNombre(request.getParameter("nombre-producto"));
            try {
                service.actualizar(premio);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            request.getSession().setAttribute("premios", service.getPremiosDisponibles());
        }
        response.sendRedirect(request.getContextPath() + "/jsp/ModificarCanje.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
