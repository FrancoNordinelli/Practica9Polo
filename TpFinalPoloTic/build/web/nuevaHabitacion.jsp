<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Habitacion</title>
    </head>
    <body>
        <form action="SvNuevaHabitacion" method="POST">
        <h1>Cantidad de personas: <input type="text" name="tipo"></h1>
        <h1>Piso: <input type="text" name="piso"></h1>
        <h1>Temática: <input type="text" name="tema"></h1>
        <h1>Precio: <input type="text" name="precio"></h1>
        <input type="submit" value="Crear">
        </form>
    </body>
</html>
