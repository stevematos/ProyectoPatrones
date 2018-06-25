<%-- 
    Document   : TransaccionDescuento
    Created on : 24/06/2018, 04:02:50 PM
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/transaccioncanje.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="../js/funciones_predeterminadas.js"></script>
        <title>Transaccion Descuento</title>
    </head>
    <body>
        <div id="contenedor_total">
            <jsp:include page="../componentes/header.jsp" flush="true">
                <jsp:param name="usuario" value="Steve" />
                <jsp:param name="tipo_usuario" value="Alumno_Prueba" />
            </jsp:include>
            <div class="row">
                <h3 id="titulo">TRANSACCIONES DE DESCUENTOS</h3>
            </div>
            <div class="row">
                <div class="col-md-2">
                    <label>PUNTOS</label>
                </div>
            
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>
            </div>
            
            
            
            <div class="row"  id="div_tabla">
                <table  class="table table-bordered">
                    <tr class="active">
                        <td>DESCONTAR</td>
                        <td>PRODUCTO</td>
                        <td>PRECIO</td>
                        <td>CANTIDAD</td>
                        <td>MONTO</td>
                        <td>PUNTOS_REQ</td>
                        <td>TOTAL_PUNTOS</td>
                        <td>MONTO_NUEVO</td>
                        
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-control" name="CJECK"  ></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                       
                    </tr>
                </table>
            </div>
            <div class="row">
                <div class="col-md-1">
                    <label> PUNTOS USADOS</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>    
            </div>
            
            <div class="row">
                <div class="col-md-1">
                    <label> PUNTOS RESTANTES</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div>    
                <div class="col-md-1">
                    <label> MONTO NUEVO TOTAL</label>
                </div>
                <div class="col-md-2">
                    <input type="text" class="form-control" name="username" required="" >
                </div> 
            </div>
            
            
            <div class="row">
                 
                
                 <div class="col-md-2 col-md-offset-3">
                    <button >GENERAR DESCUENTO</button>
                </div>
                
                <div class="col-md-2 col-md-offset-3">
                    <button >CANCELAR</button>
                </div>
                
                
            </div>
        </div>
    </body>
</html>
