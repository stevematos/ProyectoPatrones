<%-- 
    Document   : RegistroClienteTarjeta
    Created on : 27/06/2018, 06:09:02 AM
    Author     : JuniorPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/AgregarCanje.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="../js/funciones_predeterminadas.js"></script>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body style="margin:20px;padding:20px">
        <jsp:include page="../componentes/header.jsp" flush="true">
            <jsp:param name="usuario" value="Steve" />
            <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
        </jsp:include>
        <h1><b>REGISTRO CLIENTE/TARJETA</b></h1>
        
        <form>
            <h3><b>Cliente</b></h3>
            
            <div class="row">
                <div class="col-md-4"> 
                    <q>¿Existe el cliente?</q>
                    <input type="checkbox" id="checkCliente" onclick="existeCliente()"> 
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" id="nombre" type="text" name="nombre-cliente" required placeholder="Ingrese los nombres del cliente">
                </div>
                <div class="col-md-4">
                    <input class="input-text" id="apepat" type="text" name="apepat-cliente" required placeholder="Ingrese el apellido paterno del cliente">
                </div>

                <div class="col-md-4">
                    <input class="input-text" id="apemat" type="text" name="apemat-cliente" required placeholder="Ingrese el apellido materno del cliente">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-4">
                    <select name="tipodocumento-cliente" class="input-text">
                        <option value="x">Tipo Documento</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <input class="input-text" type="text" name="numerodocumento-cliente" required placeholder="Ingrese el numero del documento">
                </div>

                <div class="col-md-4">
                    <input class="input-text" id="celular" type="text" name="celular-cliente" required placeholder="Ingrese el celular del cliente">
                </div>
            </div>
            
            <h3><b>Tarjeta</b></h3>
            <br>
            <div class="row">
                <div class="col-md-4">
                    <input class="input-text" type="text" name="numero-tarjeta" required placeholder="Ingrese el nuemro de la tarjeta">
                </div>
                <div class="col-md-4">
                    <input class="input-text" type="text" name="puntos-tarjeta" required placeholder="Ingrese los puntso de la tarjeta">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-2">
                    <input class="input-text" type="submit" value="REGISTRAR">
                </div>
            </div>
        </form>
    </body>
</html>
