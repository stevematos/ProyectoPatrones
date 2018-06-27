/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.controller;

import edu.patrones.model.PerfilUsuario;
import edu.patrones.model.Usuario;
import edu.patrones.service.impl.PerfilUsuarioServiceImpl;
import edu.patrones.service.impl.UsuarioServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Carlos
 */
public class ServletLogin extends HttpServlet {

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
            out.println("<title>Servlet ServletLogin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletLogin at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
            PerfilUsuarioServiceImpl sperfil = new PerfilUsuarioServiceImpl();
            

            String usuario = request.getParameter("username");
            String password = request.getParameter("password");

            Usuario miusuario = new Usuario();
            PerfilUsuario mperfil = new PerfilUsuario();

            String direccion = susu.validarUsuario(usuario, password);
            System.out.println(direccion);
            
            miusuario = susu.listarPorNom(usuario, password);
            String nombreusuario = miusuario.getNomUsuario();

            String idperfil = miusuario.getPerfilId();
            mperfil = sperfil.listarPorId(idperfil);
            String perfilusuario = mperfil.getNombre();
            
            System.out.println(nombreusuario);
                        System.out.println(perfilusuario);

//            RequestDispatcher rd=request.getRequestDispatcher(direccion);
            
            request.getSession().setAttribute("nombre_usuario", nombreusuario);
            request.getSession().setAttribute("perfil_usuario", perfilusuario);
            
            response.sendRedirect(direccion); 

//            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
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