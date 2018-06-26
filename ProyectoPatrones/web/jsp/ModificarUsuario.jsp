<%-- 
    Document   : ModificarUsuario
    Created on : 23/06/2018, 11:32:13 PM
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
        <h1><b>MODIFICAR USUARIO</b></h1>
        <br>
        <br>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-10">
                <table>
                    <tr>
                        <th>NOMBRE</th>
                        <th>PASSWORD</th>
                        <th>PERFIL</th>
                        <th>ESTADO</th>
                    </tr>
                    <tr>
                        <td><!-- Aqui va--></td>
                        <td><!-- Aqui va--></td>
                        <td><!-- Aqui va--></td>
                        <td><!-- Aqui va--></td>
                    </tr>
                </table>
            </div>
        </div>
        <br>
        <br>
        <br>
        <form>
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" type="text" name="nombre-usuario" required placeholder="Ingrese el nombre del usuario">
                </div>
                <div class="col-md-4">
                    <input class="input-text" type="text" name="apepat-usuario" required placeholder="Ingrese el password">
                </div>

                <div class="col-md-4">
                    <input class="input-text" type="text" name="cargo-usuario" required placeholder="Ingrese el perfil del usuario">
                </div>

            </div>

            <br>
            <div class="row">
                <div class="col-md-5">
                </div>
                <div class="col-md-1">
                    <label for="estado"> Estado </label>

                </div>
                <div class="col-md-1">
                    <input class="input-text" type="checkbox" name="cargo-usuario" >

                </div>
            </div>
             <br>

            <div class="row">
                <div class="col-md-5">
                </div>
                <div class="col-md-2">
                    <input class="input-text" type="submit" value="Modificar">
                </div>
            </div>
        </form>
    </body>
</html>
