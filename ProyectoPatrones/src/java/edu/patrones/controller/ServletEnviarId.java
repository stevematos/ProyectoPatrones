/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.controller;

import edu.patrones.dao.impl.PerfilUsuarioDAOImpl;
import edu.patrones.dao.impl.UsuarioDAOImpl;
import edu.patrones.model.PerfilUsuario;
import edu.patrones.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Carlos
 */
public class ServletEnviarId extends HttpServlet {

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
            out.println("<title>Servlet ServletEnviarId</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletEnviarId at " + request.getContextPath() + "</h1>");
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
        
        Usuario musu = new Usuario();
    PerfilUsuario mperfil = new PerfilUsuario();
    UsuarioDAOImpl usudao = new UsuarioDAOImpl();
    PerfilUsuarioDAOImpl perfusu = new PerfilUsuarioDAOImpl();
    
    String idusuario = null;
    idusuario = request.getParameter("id");
    System.out.println(idusuario);
    if (idusuario != null) {
        System.out.println("idusuariosss:" + idusuario);
        musu = usudao.listarPorId(idusuario);
        String idperfil = musu.getPerfilId();
        mperfil = perfusu.listarPorId(idperfil);
    } else {
        musu = new Usuario();
        musu.setNomUsuario("");
        musu.setClveUsuario("");
        musu.setUsuarioId("");
        musu.setPerfilId("");
        mperfil = new PerfilUsuario();
        mperfil.setNombre("");
    }
    
    request.setAttribute("musu", musu);
    request.setAttribute("mperfil", mperfil);
    response.sendRedirect("jsp/ModificarUsuario.jsp");
    
    
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
