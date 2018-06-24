<%-- 
    Document   : transaccioncanje
    Created on : 23/06/2018, 08:31:59 PM
    Author     : Steve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/transaccioncanje.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="../js/funciones_predeterminadas.js"></script>
        <title>Transaccion de Canje</title>
    </head>
    <body>
        <div id="contenedor_total">
            <jsp:include page="../componentes/header.jsp" flush="true">
                <jsp:param name="usuario" value="Steve" />
                <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
            </jsp:include>
            <div class="row">
                <h3 id="titulo">TRANSACCIONES DE CANJE</h3>
            </div>
            <div class="row">
                <div class="col-md-2">
                    <label>NUMERO DE TARJETA</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>
                <div class="col-md-2">
                    <label>NUMERO DE DNI</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>
                <div class="col-md-2 col-md-offset-1">
                    <button>VERIFICAR</button>
                </div>
            </div>
            <div class="row">
                <div class="col-md-2">
                    <label>CODIGO PRODUCTO</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>
                <div class="col-md-2">
                    <label>CANTIDAD</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>
                <div class="col-md-2 col-md-offset-1">
                    <button>AGREGAR</button>
                </div>
            </div>
            <div class="row"  id="div_tabla">
                <table  class="table table-bordered">
                    <tr class="active">
                        <td>CODIGO_OPERACION</td>
                        <td>MONTO</td>
                        <td>FECHA</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
            </div>
            <div class="row">
                <div class="col-md-1">
                    <label>TOTAL PUNTOS</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>
                <div class="col-md-2 col-md-offset-3">
                    <button onclick="handleClickHref('canjeproductos')">CANJEAR</button>
                </div>
                <div class="col-md-2 col-md-offset-1">
                    <button>CANCELAR</button>
                </div>
            </div>
        </div>
    </body>
</html>
