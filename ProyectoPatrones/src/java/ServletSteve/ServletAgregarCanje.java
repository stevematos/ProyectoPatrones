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
import java.util.ArrayList;
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
public class ServletAgregarCanje extends HttpServlet {
    
    PremioServiceImpl dao=new PremioServiceImpl();

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
       ArrayList<Premio> auxAgregar=(request.getSession().getAttribute("agregarAux")==null)?
                new ArrayList<>():(ArrayList<Premio>)request.getSession().getAttribute("agregarAux");
        Premio aux=new Premio(request.getParameter("codigo-producto"));
        aux.setProveedorId(request.getParameter("id-proveedor"));
        try{
            Integer.parseInt(request.getParameter("puntos-producto"));
            aux.setCostoPuntos(request.getParameter("puntos-producto"));
        }catch(NumberFormatException ex){
            aux.setCostoPuntos("0");
        }
        aux.setNombre(request.getParameter("nombre-producto"));
        auxAgregar.add(aux);
        request.getSession().setAttribute("agregarAux", auxAgregar);
        response.sendRedirect(request.getContextPath() + "/jsp/AgregarCanje.jsp");
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
        ArrayList<Premio> aux= (ArrayList<Premio>)request.getSession().getAttribute("agregarAux");
        aux.forEach( premio -> {
            try {
                dao.agregar(premio);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        });
    }

    /**
     * Returns a short description of the servlet.
     
     * 
     * Premio p1=new Premio(request.getParameter("codigo-producto"));
        try {
            dao.agregar(p1);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        * 
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
