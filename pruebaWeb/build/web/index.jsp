<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos</h1>
        <form action="SvTest" method="POST">
        <p>Nombre: <input type="text" name ="nombre"></p>
        <p>Apellido: <input type="text" name ="apellido"></p>
        <p>Color de cabello <select name="pelo"></p>
        <option>Castaño</option>
        <option>Rubio</option>
        <option>Negro</option>
        </select>
        <p>Titulo universitario: <input type="checkbox" name="titulo" value="true"></p>
        <p>Conocimiento de Java: <input type="radio" name="java" value="bajo">Bajo
                                 <input type="radio" name="java" value="Medio">Medio
                                 <input type="radio" name="java" value="Alto">Alto</p>
        <br>
            <input type="submit" value="Enviar"> 
        </form>
    </body>
</html>
