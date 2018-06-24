<%-- 
    Document   : GestionarProductoCanje
    Created on : 23/06/2018, 10:28:59 PM
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
        <jsp:include page="./VerProductosCanje.jsp" flush="true" />
        <br>
        <a href="./AgregarCanje.jsp">Agregar Canje</a>
        <a href="./ModificarCanje.jsp">Modificar Canje</a>
        <a href="./EliminarCanje.jsp">Eliminar Canje</a>
    </body>
</html>
