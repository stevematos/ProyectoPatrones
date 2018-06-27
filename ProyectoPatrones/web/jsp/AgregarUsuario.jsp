<%-- 
    Document   : AgregarUsuario
    Created on : 23/06/2018, 11:26:32 PM
    Author     : JuniorPC
--%>

<%@page import="java.util.List"%>
<%@page import="edu.patrones.model.Usuario"%>
<%@page import="java.util.ArrayList"%>
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
        <h1><b>AGREGAR USUARIO</b></h1>
        <br>
        <br>
        <form action="${pageContext.request.contextPath}/ServletUsuario" method="post">
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" type="text" name="nombre-usuario" required placeholder="Ingrese el nombre del usuario">
                </div>
                <div class="col-md-4">
                    <input class="input-text" type="text" name="passw-usuario" required placeholder="Ingrese el password">
                </div>

                <div class="col-md-4">
                    <input class="input-text" type="text" name="perfil-usuario" required placeholder="Ingrese el perfil del usuario">
                </div>

            </div>

            <br>
            <div class="row">
                <div class="col-md-5">
                </div>
                <div class="col-md-1">
                    <label  for="estado"> Estado </label>

                </div>
                <div class="col-md-1">
                    <input class="input-text" type="checkbox" name="estado-usuario" >

                </div>
            </div>
            <br>

            <div class="row">
                <div class="col-md-5">
                </div>
                <div class="col-md-2">
                    <input class="input-text" type="submit" value="Registrar">
                </div>
            </div>
        </form>
        <br>
        <br>
        <br>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-10">
                <table>
                    <tr>
                        <th>NOMBRE</th>
                        <th>PASSWORD</th>
                        <th>PERFIL</th>
                        <th>ESTADO</th>
                    </tr>
                    <%  
                        List<Usuario> Lista = (List) request.getSession().getAttribute("Lista");
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
                        <td align="center"><%=i.getClveUsuario()%></td>
                        <td align="center"><%=nombreperfil%></td>
                        <td align="center"><%=i.getEstado()%></td>
                    </tr>    
                    <% }%>
                </table>
            </div>
        </div>
        <br>
        <form align="center" action="GestionarUsuarios.jsp">
            <input type="submit" value="CONFIRMAR">
        </form>
    </body>
</html>
