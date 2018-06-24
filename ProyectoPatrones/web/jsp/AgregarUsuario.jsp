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
        <link href="../css/AgregarCanje.css" rel="stylesheet" type="text/css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body style="margin:20px;padding:20px">
        <jsp:include page="../componentes/header.jsp" flush="true">
            <jsp:param name="usuario" value="Steve" />
            <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
        </jsp:include>
        <h1><b>AGREGAR USUARIO</b></h1>
        <br>
        <br>
        <form>
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" type="text" name="nombre-usuario" required placeholder="Ingrese el nombre del usuario">
                </div>
                <div class="col-md-4">
                    <input class="input-text" type="text" name="apepat-usuario" required placeholder="Ingrese el apellido paterno">
                </div>
                <div class="col-md-4">
                    <input class="input-text" type="text" name="apemat-usuario" required placeholder="Ingrese el apellido materno">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" type="text" name="dni-usuario" required placeholder="Ingrese el DNI del usuario">
                </div>
                <div class="col-md-4">
                    <input class="input-text" type="text" name="cargo-usuario" required placeholder="Ingrese el cargo del usuario">
                </div>
                <div class="col-md-2">
                </div>
                <div class="col-md-2">
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
                        <th>DNI</th>
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
                        <td><!-- Aqui va--></td>
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
