<%-- 
    Document   : canjeproductos
    Created on : 23/06/2018, 10:25:30 PM
    Author     : Steve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/canjeproductos.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contenedor_total">
            <jsp:include page="../componentes/header.jsp" flush="true">
                <jsp:param name="usuario" value="Steve" />
                <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
            </jsp:include>
            <div class="row" id="contenedor_parcial">
                <div class="row" id="contenedor_parcial_contenido">
                    <div class="row">
                        <div class="col-md-1">
                            <label>FECHA</label>
                        </div>
                        <div class="col-md-2">
                            <input type="text" class="form-control" name="username" required="" >
                        </div>
                        <div class="col-md-1 col-md-offset-7">
                            <img>
                        </div>
                    </div>
                    <div class="row">
                        <hr>
                    </div>
                    <div class="row">
                        <div class="col-md-2">
                            <label>NOMBRES</label>
                        </div>
                        <div class="col-md-2">
                            <input type="text" class="form-control" name="username" required="" >
                        </div>
                        <div class="col-md-2">
                            <label>NUMERO DNI</label>
                        </div>
                        <div class="col-md-2">
                            <input type="text" class="form-control" name="username" required="" >
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-2">
                            <label>PUNTOS</label>
                        </div>
                        <div class="col-md-2">
                            <input type="text" class="form-control" name="username" required="" >
                        </div>
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
                    <div class="col-md-2">
                        <label>TOTAL DE PUNTOS</label>
                    </div>
                    <div class="col-md-2">
                        <input type="text" class="form-control" name="username" required="" >
                    </div>
                    <div class="col-md-2 col-md-offset-6">
                        <button>IMPRIMIR</button>
                    </div>
                </div>
            </div>
            <div class="row" id="botones">
                <div class="col-md-2 col-md-offset-4">
                    <button>CANJEAR</button>
                </div>
                <div class="col-md-2">
                    <button>CANCELAR</button>
                </div>
            </div>
        </div>
    </body>
</html>
