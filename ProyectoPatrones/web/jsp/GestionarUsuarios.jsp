<%-- 
    Document   : GestionarUsuarios
    Created on : 23/06/2018, 11:20:18 PM
    Author     : JuniorPC
--%>

<%@page import="edu.patrones.model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="edu.patrones.dao.impl.UsuarioDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/GestionarProductoCanje.css" rel="stylesheet" type="text/css">
        <link href="../css/VerProductosCanje.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body style="margin:20px;padding:20px">
        <jsp:include page="../componentes/header.jsp" flush="true">
            <jsp:param name="usuario" value="Steve" />
            <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
        </jsp:include>
        <h1>USUARIOS DEL SISTEMA</h1>
        <br>
        <br>
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <table>
                    <tr>
                        <th>NOMBRE</th>
                        <th>PERFIL</th>
                        <th>ESTADO</th>
                    </tr>
                    <%  
                        List<Usuario> Lista = (List) request.getSession().getAttribute("Lista");
                        System.out.println(Lista.size());
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
                        <td align="center"><%=varEstado%></td>
                        

                    </tr>    
                    <% }%>
                </table>
            </div>
        </div>
        <br>
        <br>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-10 row">
                <hr>
                <br>
                <div class="col-md-4" align="left">
                    <a href="./AgregarUsuario.jsp"><img class="imagen"
                                                        src="https://image.flaticon.com/icons/png/512/94/94979.png"
                                                        alt="Agregar Usuario"><br>Agregar Usuario</a>
                </div>
                <div class="col-md-4" align="center">
                    <a href="./ModificarUsuario.jsp"><img class="imagen"
                                                          src="https://www.shareicon.net/data/2015/09/17/642233_edit_512x512.png"
                                                          alt="Modificar Usuario"><br>Modificar Usuario</a>
                </div>
                <div class="col-md-4" align="right">
                    <a href="./EliminarUsuario.jsp"><img class="imagen"
                                                         src="https://image.flaticon.com/icons/png/512/51/51418.png"
                                                         alt="Eliminar Usuario"><br>Eliminar Usuario</a>
                </div>
            </div>
        </div>
    </body>
</html>
