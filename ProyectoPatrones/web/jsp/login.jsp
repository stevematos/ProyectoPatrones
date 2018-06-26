<%-- 
    Document   : newjsp
    Created on : 22/06/2018, 06:48:04 PM
    Author     : VIDEOTECA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/login.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/ServletLogin" method="post">
        <div class="col-md-4 col-md-offset-4" id="login-form">
                <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png"/>
                
                <input type="text" id="usuario-input" class="form-control" name="username" placeholder="Usuario" required="" autofocus="" />
                <input type="password" id="contrasenia-input" class="form-control" name="password" placeholder="Contraseña" required=""/> 
                <button class="btn btn-lg btn-primary btn-block" type="submit">INGRESAR</button>
        </div>
        </form>
    </body>
</html>
