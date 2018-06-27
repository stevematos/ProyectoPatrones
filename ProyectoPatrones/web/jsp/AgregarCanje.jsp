<%-- 
    Document   : AgregarCanje
    Created on : 23/06/2018, 10:36:58 PM
    Author     : JuniorPC
--%>

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
        <h1><b>AGREGAR PRODUCTOS DE CANJE</b></h1>
        <br>
        <br>
        <form>
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" type="text" name="nombre-producto" required placeholder="Ingrese el nombre del producto">
                </div>
                <div class="col-md-3">
                    <input class="input-text" type="text" name="puntos-producto" required placeholder="Ingrese los puntos requeridos">
                </div>
                <div class="col-md-2">
                    <input class="input-text" type="text" name="stock-producto" required placeholder="Ingrese el stock">
                </div>
                <div class="col-md-3">
                    <select name="proveedor-producto" class="input-text">
                        <option>Opción 1 - proveedor x</option>
                    </select>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-6">
                    <textarea class="input-text" rows="3" name="observacion-producto" placeholder="Ingrese las observaciones"></textarea>
                </div>
                <div class="col-md-3"></div>
                <div class="col-md-2">
                    <br>
                    <input class="input-text" type="submit" value="Agregar">
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
                        <th>NOMBRE DEL PRODUCTO</th>
                        <th>PUNTOS</th>
                        <th>STOCK</th>
                        <th>PROVEEDOR</th>
                    </tr>
                    <tr>
                        <td><!-- Aqui va el codigo--></td>
                        <td><!-- Aqui va el nombre--></td>
                        <td><!-- Aqui va los puntos--></td>
                        <td>info xdxd</td>
                    </tr>
                </table>
            </div>
        </div>
        <br>
        <form align="center">
            <input type="submit" value="CONFIRMAR">
        </form>
    </body>
</html>
