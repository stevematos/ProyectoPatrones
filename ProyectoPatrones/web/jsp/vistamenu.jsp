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
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contenedor_total">
            <div class="row">
                <div class="col-md-4">
                    <button>Home</button>
                    <label>tipo_usuario</label>
                </div>
                <div class="col-md-4 col-md-offset-4">
                    <label>usuario</label>
                    <img src="//ssl.gstatic.com/accounts/ui/avatar_2x.png"/> 
                </div>
            </div>
            <hr>
            <div id="Banner">
                <h1>DATOS DE USUARIO</h1>
            </div>
            <div id="Opciones">
                <div class="row">
                    <div class="col-md-6">
                        <button>Historial de ventas</button>
                    </div>
                    <div class="col-md-6">
                        <button>Transacciones de Ventas</button>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <button>Transacciones de canje</button>
                    </div>
                    <div class="col-md-6">
                        <button>Gestionar Canje</button>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <button>Ver Productos Canje</button>
                    </div>
                    <div class="col-md-6">
                        <button>Gestionar Usuarios</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
