<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--Formulario front para el ingreso al sistema del Usuario Empleado. Lleva
el nombre de Usuario al Servlet SvAdministracion--> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IngresoUsuario</title>
    </head>
    <div style="text-align: center">
    <body>
        <form action="SvAdministracion" method="POST">
            <h1>Ingreso Usuario</h1>
            <p>Usuario: <input type="text" name="usuario"></p>
            <p>Contraseña: <input type="password" name="contraseña"></p>
            <input type="submit" value="Entrar"> 
        </form>
    </div>
    </body>
</html>
