<%-- 
    Document   : GestionarUsuarios
    Created on : 23/06/2018, 11:20:18 PM
    Author     : JuniorPC
--%>

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
                        <th>PRODUCTOS</th>
                        <th>PUNTOS REQUERIDOS</th>
                    </tr>
                    <tr>
                        <td>TEXT 1</td>
                        <td>TEXT 2</td>
                    </tr>
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
