<%-- 
    Document   : vistamenu
    Created on : 23/06/2018, 02:31:04 AM
    Author     : Steve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/vistamenu.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="../js/funciones_predeterminadas.js"></script>
        <title>Menu Principal</title>
    </head>
    <body>
        <div id="contenedor_total">
            <jsp:include page="../componentes/header.jsp" flush="true">
                <jsp:param name="usuario" value="Steve" />
                <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
            </jsp:include>
            <div class="row" id="Banner">
                <h1>DATOS DE USUARIO</h1>
            </div>
            <div class="row" id="Opciones">
                <div class="row">
                    <div class="col-md-6">
                        <button onclick="handleClickHref('historialventas');">Historial de ventas</button>
                    </div>
                    <div class="col-md-6">
                        <button>Transacciones de Ventas</button>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <button onclick="handleClickHref('transaccioncanje');">Transacciones de canje</button>
                    </div>
                    <div class="col-md-6">
                        <button onclick="handleClickHref('GestionarProductoCanje')">Gestionar Canje</button>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <button onclick="handleClickHref('VerProductosCanje')">Ver Productos Canje</button>
                    </div>
                    <div class="col-md-6">
                        <button onclick="handleClickHref('GestionarUsuarios')">Gestionar Usuarios</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
