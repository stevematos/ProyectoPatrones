/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.controller;

import edu.patrones.model.Usuario;
import edu.patrones.service.impl.UsuarioServiceImpl;
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
 * @author Juan Carlos
 */
public class ServletActualizarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletActualizarUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletActualizarUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        
            String idusuario = request.getParameter("id");
            System.out.println("idusuario:" + idusuario);
        
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

            String idusuario = request.getParameter("id");
            System.out.println("idusuario:" + idusuario);

//            if (request.getParameter("button1") != null) {
//                susu.cargarCombos();
//            }

            if (idusuario != null) {
                Integer nuevoId = susu.obtenerId();
                musu.setUsuarioId(nuevoId.toString());
                musu.setClveUsuario(password);
                musu.setNomUsuario(usuario);

                if (perfil.equalsIgnoreCase("ADMINISTRADOR")) {
                    musu.setPerfilId("4");
                } else if (perfil.equalsIgnoreCase("ASISTENTE_VENTAS")) {
                    musu.setPerfilId("2");
                } else if (perfil.equalsIgnoreCase("ASISTENTE_CANJE")) {
                    musu.setPerfilId("3");
                }

                if (estado.equalsIgnoreCase("on")) {
                    musu.setEstado((short) 1);
                } else {
                    musu.setEstado((short) 0);
                }

                susu.actualizar(musu);
            }

            response.sendRedirect("jsp/ModificarUsuario.jsp");

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