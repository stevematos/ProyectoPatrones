/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.controller;

import edu.patrones.dao.impl.UsuarioDAOImpl;
import edu.patrones.model.Usuario;
import edu.patrones.service.impl.UsuarioServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Carlos
 */
public class ServletUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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

        try {

            UsuarioServiceImpl susu = new UsuarioServiceImpl();
            Usuario musu = new Usuario();

            String usuario = request.getParameter("nombre-usuario");
            String password = request.getParameter("passw-usuario");
            String perfil = request.getParameter("perfil-usuario");
            String estado = request.getParameter("estado-usuario");

            System.out.println(estado);
            
            Integer nuevoId = susu.obtenerId();
            musu.setUsuarioId(nuevoId.toString());
            musu.setClveUsuario(password);
            musu.setNomUsuario(usuario);
            
            if(perfil.equalsIgnoreCase("ADMINISTRADOR")){
                musu.setPerfilId("4");
            }else if (perfil.equalsIgnoreCase("ASISTENTE_VENTAS")) {
                musu.setPerfilId("2");
            }else if (perfil.equalsIgnoreCase("ASISTENTE_CANJE")) {
                musu.setPerfilId("3");
            }
            
            if(estado.equalsIgnoreCase("on")){
                musu.setEstado((short)1);
            }else{
                musu.setEstado((short)0);
            }
            
            
            
            susu.agregar(musu);
            
            response.sendRedirect("jsp/AgregarUsuario.jsp");

        } catch (Exception ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

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
