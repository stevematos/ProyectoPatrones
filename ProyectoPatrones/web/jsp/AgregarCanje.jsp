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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../componentes/header.jsp" flush="true">
            <jsp:param name="usuario" value="Steve" />
            <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
        </jsp:include>
        <h1>Agregar Productos de Canje</h1>
        <br>
        <form>
            <label>CODIGO DEL PRODUCTO</label>
            <input type="text" name="codigo-producto" placeholder="Ingrese el código">
            <label>NOMBRE DEL PRODUCTO</label>
            <input type="text" name="nombre-producto" placeholder="Ingrese el nombre">
            <label>PUNTOS DEL PRODUCTO</label>
            <input type="text" name="puntos-producto" placeholder="Puntos requeridos">
            <input type="submit" value="Agregar">
        </form>
        <br>
        <table>
            <tr>
                <th>CODIGO</th>
                <th>NOMBRE</th>
                <th>PUNTOS REQUERIDOS</th>
            </tr>
            <tr>
                <td><!-- Aqui va el codigo--></td>
                <td><!-- Aqui va el nombre--></td>
                <td><!-- Aqui va los puntos--></td>
            </tr>
        </table>
        <form>
            <input type="submit" value="Confirmar">
        </form>
    </body>
</html>
