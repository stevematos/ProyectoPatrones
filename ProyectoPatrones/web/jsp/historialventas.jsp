<%-- 
    Document   : historialventas
    Created on : 23/06/2018, 06:41:34 PM
    Author     : Steve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/historialventas.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contenedor_total">
            <jsp:include page="../componentes/header.jsp" flush="true">
                <jsp:param name="usuario" value="Steve" />
                <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
            </jsp:include>
            <div class="row">
                <h3 id="titulo">HISTORIAL DE VENTAS</h3>
            </div>
            <div class="row">
                <div class="col-md-2"  id="calendario">
                    <select  class="form-control">
                        <option>CALENDARIO</option>
                    </select>
                </div>
                <div class="col-md-2 col-md-offset-1">
                    <button>CONSULTAR</button>
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
                <div class="col-md-2 col-md-offset-5">
                    <button>Imprimir</button>
                </div>
            </div>
        </div>
    </body>
</html>
