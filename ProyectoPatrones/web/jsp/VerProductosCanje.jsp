<%-- 
    Document   : VerProductosCanje
    Created on : 23/06/2018, 08:27:14 PM
    Author     : JuniorPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/VerProductosCanje.css" rel="stylesheet" type="text/css">
        <title>Productos en canje</title>
    </head>
    <body style="margin:20px;padding:20px">

        <%//@ include file="./vistamenu.jsp" %>
        <jsp:include page="../componentes/header.jsp" flush="true">
            <jsp:param name="usuario" value="Steve" />
            <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
        </jsp:include>

        <h1><b>PRODUCTOS DISPONIBLES PARA CANJE</b></h1>
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
    </body>
</html>
