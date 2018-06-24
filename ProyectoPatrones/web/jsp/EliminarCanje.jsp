<%-- 
    Document   : EliminarCanje
    Created on : 23/06/2018, 11:01:22 PM
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
        <h1>Eliminar Productos de Canje</h1>
        <br>
        <table>
            <tr>
                <th>¿ELIMINAR?</th>
                <th>CODIGO</th>
                <th>NOMBRE</th>
                <th>PUNTOS REQUERIDOS</th>
            </tr>
            <tr>
                <td><!-- Aqui va el checkbox--></td>
                <td><!-- Aqui va el codigo--></td>
                <td><!-- Aqui va el nombre--></td>
                <td><!-- Aqui va los puntos--></td>
            </tr>
        </table>
        <form>
            <input type="submit" value="Eliminar">
        </form>
    </body>
</html>
