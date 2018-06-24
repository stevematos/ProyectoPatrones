<%-- 
    Document   : VerProductosCanje
    Created on : 23/06/2018, 08:27:14 PM
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

        <%@ include file="./vistamenu.jsp" %>
        <jsp:include page="./vistamenu.jsp" flush="true" />.

        <h1>Productos Disponible para Canje</h1>
        <br>
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
    </body>
</html>
