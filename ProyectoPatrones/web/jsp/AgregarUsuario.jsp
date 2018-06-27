<%-- 
    Document   : AgregarUsuario
    Created on : 23/06/2018, 11:26:32 PM
    Author     : JuniorPC
--%>

<%@page import="java.util.List"%>
<%@page import="edu.patrones.model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.patrones.dao.impl.UsuarioDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    // Recuperar LISTA DE USUARIOS

    UsuarioDAOImpl usudao = new UsuarioDAOImpl();
    List<Usuario> Lista = new ArrayList<Usuario>();
    Lista = usudao.listar();

%>
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
                        for (int i = 0; i < Lista.size(); i++) {

                            
                            String perfil = Lista.get(i).getPerfilId();
                            String perfilm = perfil.trim();
                            String nombreperfil="";
                            if(perfilm.equalsIgnoreCase("1")){
                                 nombreperfil = "CLIENTE";
                            }else if(perfilm.equalsIgnoreCase("2")){
                                 nombreperfil = "ASISTENTE_VENTAS";
                            }else if(perfilm.equalsIgnoreCase("3")){
                                 nombreperfil = "ASISTENTE_CANJE";
                            }else if(perfilm.equalsIgnoreCase("4")){
                                 nombreperfil = "ADMINISTRADOR";
                            }
                            
                            

                    %>
                    <tr>
                         
                        <td align="center"><%=Lista.get(i).getNomUsuario()%></td>
                        <td align="center"><%=Lista.get(i).getClveUsuario()%></td>
                        <td align="center"><%=nombreperfil%></td>
                        <td align="center"><%=Lista.get(i).getEstado()%></td>
                    </tr>    
                    <% }%>
                </table>
            </div>
        </div>
        <br>
        <form align="center">
            <input type="submit" value="CONFIRMAR">
        </form>
    </body>
</html>
