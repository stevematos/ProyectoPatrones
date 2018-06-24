<%-- 
    Document   : AgregarUsuario
    Created on : 23/06/2018, 11:26:32 PM
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
        <h1>Agregar Usuario</h1>
        <br>
        <form>
            <label>NOMBRE</label>
            <input type="text" name="nombre-usuario" placeholder="Complete">
            <label>APELLIDO PATERNO</label>
            <input type="text" name="apepat-usuario" placeholder="Complete">
            <label>APELLIDO MATERNO</label>
            <input type="text" name="apemat-usuario" placeholder="Complete">
            <label>CARGO</label>
            <input type="text" name="cargo-usuario" placeholder="Complete">
            <input type="submit" value="Agregar">
        </form>
        <br>
        <table>
            <tr>
                <th>NOMBRE</th>
                <th>APELLIDO PATERNO</th>
                <th>APELLIDO MATERNO</th>
                <th>CARGO</th>
            </tr>
            <tr>
                <td><!-- Aqui va--></td>
                <td><!-- Aqui va--></td>
                <td><!-- Aqui va--></td>
                <td><!-- Aqui va--></td>
            </tr>
        </table>
        <form>
            <input type="submit" value="Confirmar">
        </form>
    </body>
</html>
