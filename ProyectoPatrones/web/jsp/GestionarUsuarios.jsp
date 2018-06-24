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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../componentes/header.jsp" flush="true">
            <jsp:param name="usuario" value="Steve" />
            <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
        </jsp:include>
        <h1>Usuarios del Sistema</h1>
        <br>
        <table>
            <tr>
                <th>NOMBRES</th>
                <th>CARGO</th>
            </tr>
            <tr>
                <td>TEXT 1</td>
                <td>TEXT 2</td>
            </tr>
        </table>
        <br>
        <a href="./AgregarUsuario.jsp">Agregar Usuario</a>
        <a href="./ModificarUsuario.jsp">Modificar Usuario</a>
        <a href="./EliminarUsuario.jsp">Eliminar Usuario</a>
    </body>
</html>
