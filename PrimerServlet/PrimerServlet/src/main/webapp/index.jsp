<%-- 
    Document   : index
    Created on : 01-ago-2023, 14:34:03
    Author     : Pedro Ríos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario retocado</title>
    </head>
    <body>
        <h1>Datos del usuario</h1>
        <form action="svUsuarios" method="POST">
            <p><label>Dni:</label><input type ="text" name="dni"></p>
            <p><label>Nombre:</label><input type ="text" name="nombre"></p>
            <p><label>Apellido</label><input type ="text" name="apellido"></p>
            <p><label>Movil</label><input type ="text" name="movil"></p>
            <button type="submir">Enviar</button> 
        </form>
    </body>
</html>
