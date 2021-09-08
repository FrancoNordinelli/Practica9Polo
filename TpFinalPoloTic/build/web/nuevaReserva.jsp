<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SvNuevaReserva" method="POST">
            <h1>Datos Reserva</h1>
            <h3>Check-in <input type="date" name="checkIn"></h3>
            <h3>Check-out <input type="date" name="checkOut"></h3>
            <h1>Datos Huesped</h1>
            <h3>Nombre <input type="text" name="nombreHuesped"></h3>
            <h3>Apellido <input type="text" name="apellidoHuesped"></h3>
            <h3>DNI <input type="text" name="dni"></h3>
            <h3>Direccion <input type="text" name="direHuesped"></h3>
            <h3>Profesion <input type="text" name="profesionHuesped"></h3>
            <h3>Fecha Nacimiento <input type="date" name="nacimientoHuesped"></h3>
            <h1>Habitacion</h1>
            <h3>Numero Habitacion <input type="text" name="idHabitacion"></h3>
            <input type="submit" value="Reservar">
        </form>
    </body>
</html>
