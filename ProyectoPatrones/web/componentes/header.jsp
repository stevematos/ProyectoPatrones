<%-- 
    Document   : header
    Created on : 23/06/2018, 04:08:10 PM
    Author     : Steve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
<link href="../css/componentesCss/header.css" rel="stylesheet" type="text/css">
<!DOCTYPE html>
<div class="row">
    <div class="row" id="header">
        <div class="col-md-4" id="home_tipousuario">
            <button id="boton_header">Home</button>
            <label>${param.tipo_usuario}</label>
        </div>
        <div class="col-md-2 col-md-offset-4" id="usuario">
            <label>${param.usuario}</label>
        </div>
        <div class="col-md-2" id="imagen">
            <img class="img-rounded" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png"/> 
        </div>
    </div>
    <hr>
</div>
