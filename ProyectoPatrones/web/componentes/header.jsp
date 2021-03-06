<%-- 
    Document   : header
    Created on : 23/06/2018, 04:08:10 PM
    Author     : Steve
--%>
<%

    String nombre = (String) session.getAttribute("nombre_usuario");
    String perfil = (String) session.getAttribute("perfil_usuario");
    String vista_menu = (String) session.getAttribute("vista_menu");
    System.out.println(vista_menu);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" >
        <link href="../css/componentesCss/header.css" rel="stylesheet" type="text/css" >
        <script type="text/javascript" src="../js/funciones_predeterminadas.js"></script>
    </head>
    <body>
        <div class="row">
            <div class="row" id="header">
                <div class="col-md-4" id="home_tipousuario">
                    <button id="boton_header" onclick="handleClickHref('login')">Cerrar Sesion</button>

                    <%
                        if (vista_menu != null) {
                    %>
                    <button id="boton_header" onclick="handleClickHref('<%=vista_menu%>')">Home</button>
                    <%
                        }
                    %>
                   
                    <label><%=perfil%></label>
                </div>
                <div class="col-md-2 col-md-offset-4" id="usuario">
                    <label><%=nombre%></label>
                </div>
                <div class="col-md-2" id="imagen">
                    <img class="img-rounded" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png"/> 
                </div>
            </div>
            <hr>
        </div>
    </body>
</html>
