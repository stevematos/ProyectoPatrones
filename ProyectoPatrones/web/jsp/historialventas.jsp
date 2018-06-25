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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="../js/moment.min.js"></script>
         <script src="../js/bootstrap-datetimepicker.min.js"></script>
         <script src="../js/bootstrap-datetimepicker.es.js"></script>
         <link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" type="text/css">
        <title>Historial de Ventas</title>
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
                    <div class='input-group date' id='divMiCalendario'>
                      <input type='text' id="txtFecha" class="form-control"  readonly/>
                      <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span>
                      </span>
                    </div>
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
        <script type="text/javascript">
           $('#divMiCalendario').datetimepicker({
                format: 'YYYY-MM-DD'       
            });
            $('#divMiCalendario').data("DateTimePicker").show();
         </script>
    </body>
</html>
