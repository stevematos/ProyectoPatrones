<%-- 
    Document   : ModificarCanje
    Created on : 23/06/2018, 10:55:44 PM
    Author     : JuniorPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
        <h1><b>MODIFICAR PRODUCTOS DE CANJE</b></h1>
        <br>
        <br>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-10">
                <table>
                    <tr>
                        <th>CODIGO</th>
                        <th>NOMBRE</th>
                        <th>PUNTOS REQUERIDOS</th>
                        <th></th>
                    </tr>
                    <c:forEach items="${premios}" var="premio">
                    <tr>
                        <td>${premio.premioId}</td>
                        <td>${premio.nombre}</td>
                        <td>${premio.costoPuntos}</td>
                        <td>
                            <a  href="../ServletModificarCanje?method=doPost&id=${premio.premioId}"  >
                             Editar
                            </a>
                        </td>
                    </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <br>
        <br>
        <br>
        <form action="../ServletModificarCanje" method="POST">
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" value="${premioEditar.nombre}" type="text" name="nombre-producto" required placeholder="Ingrese el código del producto">
                </div>
                <div class="col-md-4">
                    <input class="input-text" value="${premioEditar.costoPuntos}" type="text" name="puntos-producto" required placeholder="Ingrese los puntos requeridos">
                </div>
                <div class="col-md-2">
                </div>
                <div class="col-md-2">
                    <input class="input-text" type="submit" value="Modificar">
                </div>
            </div>
        </form>
    </body>
</html>
