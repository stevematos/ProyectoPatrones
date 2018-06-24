<%-- 
    Document   : GestionarProductoCanje
    Created on : 23/06/2018, 10:28:59 PM
    Author     : JuniorPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/GestionarProductoCanje.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body style="margin:20px;padding:20px">
        <jsp:include page="./VerProductosCanje.jsp" flush="true" />
        <br>
        <br>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-10 row">
                <hr>
                <br>
                <div class="col-md-4" align="left">
                    <a href="./AgregarCanje.jsp"><img class="imagen"
                                                      src="https://cdn.icon-icons.com/icons2/1369/PNG/512/-create-new-folder_90671.png"
                                                      alt="Agregar Canje"><br>Agregar Canje</a>
                </div>
                <div class="col-md-4" align="center">
                    <a href="./ModificarCanje.jsp"><img class="imagen"
                                                         src="https://png.icons8.com/metro/1600/create-new.png"
                                                         alt="Modificar Canje"><br>Modificar Canje</a>
                </div>
                <div class="col-md-4" align="right">
                    <a href="./EliminarCanje.jsp"><img class="imagen"
                                                       src="https://png.icons8.com/metro/1600/delete.png"
                                                       alt="Eliminar Canje"><br>Eliminar Canje</a>
                </div>
            </div>
        </div>
    </body>
</html>
