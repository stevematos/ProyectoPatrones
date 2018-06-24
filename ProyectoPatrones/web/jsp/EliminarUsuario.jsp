<%-- 
    Document   : EliminarUsuario
    Created on : 23/06/2018, 11:33:45 PM
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
        <jsp:include page="./vistamenu.jsp" flush="true" />
        <h1>Eliminar Usuario</h1>
        <br>
        <table>
            <tr>
                <th>¿ELIMINAR?</th>
                <th>NOMBRES</th>
                <th>CARGO</th>
            </tr>
            <tr>
                <td><!-- Aqui va el checkbox--></td>
                <td><!-- Aqui va el nombre--></td>
                <td><!-- Aqui va el cargo--></td>
            </tr>
        </table>
        <form>
            <input type="submit" value="Eliminar">
        </form>
    </body>
</html>
