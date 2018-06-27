<%-- 
    Document   : EliminarUsuario
    Created on : 23/06/2018, 11:33:45 PM
    Author     : JuniorPC
--%>

<%@page import="edu.patrones.model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/AgregarCanje.css" rel="stylesheet" type="text/css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body style="margin:20px;padding:20px">
        <jsp:include page="../componentes/header.jsp" flush="true">
            <jsp:param name="usuario" value="Steve" />
            <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
        </jsp:include>
        <h1><b>ELIMINAR USUARIO</b></h1>
        <br>
        <br>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-10">
                <table>
                        <tr>
                            <th>NOMBRE</th>
                            <th>PERFIL</th>
                            <th></th>
                        </tr>
                        <%  List<Usuario> Lista = (List) request.getSession().getAttribute("Lista");

                            for (Usuario i : Lista) {

                                String id = i.getNomUsuario();
                                String perfil = i.getPerfilId();
                                String varEstado = "";

                                String perfilm = perfil.trim();
                                String nombreperfil = "";
                                if (perfilm.equals("1")) {
                                    nombreperfil = "CLIENTE";
                                } else if (perfilm.equals("2")) {
                                    nombreperfil = "ASISTENTE_VENTAS";
                                } else if (perfilm.equals("3")) {
                                    nombreperfil = "ASISTENTE_CANJE";
                                } else if (perfilm.equals("4")) {
                                    nombreperfil = "ADMINISTRADOR";
                                }
                                short estado = i.getEstado();
                                if (estado == 1) {
                                    varEstado = "ACTIVO";
                                } else {
                                    varEstado = "INACTIVO";
                                }


                        %>
                        <tr>

                            <td align="center"><%=i.getNomUsuario()%></td>
                            <td align="center"><%=nombreperfil%></td>
                            <td>
                                <a  href="../ServletEliminarUsuario?id=<%=id%>"  >
                                    Eliminar
                                </a>
                            </td>

                        </tr>    
                        <% }%>
                    </table>
            </div>
        </div>
        <br>
        <br>
        <br>
        <form align="center" action="GestionarUsuarios.jsp">
            <input type="submit" value="CONFIRMAR">
        </form>
        
    </body>
</html>
