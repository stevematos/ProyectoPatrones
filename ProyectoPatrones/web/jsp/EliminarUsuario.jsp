<%-- 
    Document   : EliminarUsuario
    Created on : 23/06/2018, 11:33:45 PM
    Author     : JuniorPC
--%>

<%@page import="edu.patrones.dao.impl.UsuarioDAOImpl"%>
<%@page import="edu.patrones.model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    // Recuperar LISTA DE USUARIOS

    UsuarioDAOImpl usudao = new UsuarioDAOImpl();
    
    List<Usuario> Lista = new ArrayList<Usuario>();
    
    Lista = usudao.listar();
    
    
    

%>
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
                        <%  for (int i = 0; i < Lista.size(); i++) {

                                String id = Lista.get(i).getUsuarioId();
                                String perfil = Lista.get(i).getPerfilId();

                                String perfilm = perfil.trim();
                                String nombreperfil = "";
                                if (perfilm.equalsIgnoreCase("1")) {
                                    nombreperfil = "CLIENTE";
                                } else if (perfilm.equalsIgnoreCase("2")) {
                                    nombreperfil = "ASISTENTE_VENTAS";
                                } else if (perfilm.equalsIgnoreCase("3")) {
                                    nombreperfil = "ASISTENTE_CANJE";
                                } else if (perfilm.equalsIgnoreCase("4")) {
                                    nombreperfil = "ADMINISTRADOR";
                                }


                        %>
                        <tr>

                            <td align="center"><%=Lista.get(i).getNomUsuario()%></td>
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
