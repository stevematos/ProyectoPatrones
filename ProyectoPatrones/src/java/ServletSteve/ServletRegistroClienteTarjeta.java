/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletSteve;

import edu.patrones.model.Cliente;
import edu.patrones.model.Tarjeta;
import edu.patrones.model.TarjetaCliente;
import edu.patrones.service.impl.ClienteServiceImpl;
import edu.patrones.service.impl.TarjetaClienteServiceImpl;
import edu.patrones.service.impl.TarjetaServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JuniorPC
 */
@WebServlet(name = "ServletRegistroClienteTarjeta", urlPatterns = {"/ServletRegistroClienteTarjeta"})
public class ServletRegistroClienteTarjeta extends HttpServlet {

    ClienteServiceImpl daoCliente = new ClienteServiceImpl();
    TarjetaServiceImpl daoTarjeta = new TarjetaServiceImpl();
    TarjetaClienteServiceImpl daoTarjetaCliente = new TarjetaClienteServiceImpl();

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

        String existe = request.getParameter("existe");

        if (existe == null) { //si el checkbox esta desmarcado
            Cliente cli = new Cliente(request.getParameter("numerodocumento-cliente"));
            cli.setNombre(request.getParameter("nombre-cliente"));
            cli.setApepat(request.getParameter("apepat-cliente"));
            cli.setApemat(request.getParameter("apemat-cliente"));
            cli.setTipodocId(request.getParameter("tipodocumento-cliente"));
            cli.setNrodoc(request.getParameter("numerodocumento-cliente"));
            cli.setCelular(request.getParameter("celular-cliente"));
            cli.setEstado(Short.parseShort("1"));
            cli.setUsuarioId("1");
            try {
                daoCliente.agregar(cli);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        Tarjeta tar = new Tarjeta(request.getParameter("id-tarjeta"));
        tar.setNumTarjeta(request.getParameter("numero-tarjeta"));
        tar.setPtsActuales(Integer.parseInt(request.getParameter("puntos-tarjeta")));
        tar.setPtsAcumulados(Integer.parseInt(request.getParameter("puntos-tarjeta")));
        try {
            daoTarjeta.agregar(tar);
        } catch (Exception e) {
            System.out.println(e);
        }

        TarjetaCliente tarcli = new TarjetaCliente(request.getParameter("id-tarjeta"));
        tarcli.setClienteId(request.getParameter("numerodocumento-cliente"));
        tarcli.setTarjetaId(request.getParameter("id-tarjeta"));
        try {
            daoTarjetaCliente.agregar(tarcli);
        } catch (Exception e) {
            System.out.println(e);
        }

        response.sendRedirect(request.getContextPath() + "/jsp/RegistroClienteTarjeta.jsp");
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
        response.sendRedirect(request.getContextPath() + "/jsp/RegistroClienteTarjeta.jsp");
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
