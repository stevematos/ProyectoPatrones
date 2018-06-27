<%-- 
    Document   : AgregarCanje
    Created on : 23/06/2018, 10:36:58 PM
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
        <h1><b>AGREGAR PRODUCTOS DE CANJE</b></h1>
        <br>
        <br>
        <form action="../ServletAgregarCanje" method="GET">
            <div class="row">
                <div class="row">
                    <div class="col-md-3">
                        <input class="input-text" type="text" name="codigo-producto" required placeholder="Ingrese el código del producto">
                    </div>
                    <div class="col-md-4">
                        <input class="input-text" type="text" name="nombre-producto" required placeholder="Ingrese el nombre del producto">
                    </div>
                    <div class="col-md-4">
                        <input class="input-text" type="text" name="puntos-producto" required placeholder="Ingrese los puntos requeridos">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <input class="input-text" type="text" name="imagen-producto" required placeholder="Ingrese la imagen del producto">
                    </div>
                    <div class="col-md-4">
                        <input class="input-text" type="text" name="observacion-producto" required placeholder="Ingrese la observacion del producto(Fecha vencimiento)">
                    </div>
                    <div class="col-md-2">
                        <input class="input-text" type="text" name="stock-producto" required placeholder="Ingrese el stock">
                    </div>
                    <div class="col-md-2">
                        <select class="form-control" name="id-proveedor">
                            <c:forEach items="${proveedores}" var="proveedor">
                                <option value=${proveedor.proveedorId}>${proveedor.nombre}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-2">
                        <input class="input-text" type="submit" value="Agregar">
                    </div>
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
                        <th>CODIGO</th>
                        <th>NOMBRE</th>
                        <th>PUNTOS REQUERIDOS</th>
                    </tr>
                    <c:forEach items="${agregarAux}" var="premioAux">
                        <tr>
                            <td>${premioAux.premioId}</td>
                            <td>${premioAux.nombre}</td>
                            <td>${premioAux.costoPuntos}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <br>
        <form align="center" action="../ServletAgregarCanje" method="POST">
            <input type="submit" value="CONFIRMAR">
        </form>
    </body>
</html>
