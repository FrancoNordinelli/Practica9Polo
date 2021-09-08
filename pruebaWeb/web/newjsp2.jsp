<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuesta de cliente</title>
    </head>
    <body>
        <!--se traen los valores de la sesión-->
        <h1>Ingresó los siguientes datos</h1>
        <p>Nombre: <%=session.getAttribute("nombre")%> </p>
        <p>Apellido: <%=session.getAttribute("apellido")%> </p>
        <p>Color de cabello: <%=session.getAttribute("pelo")%> </p>
        <p>Titulo: <%=session.getAttribute("titulo")%> </p>
        <p>Nivel Java: <%=session.getAttribute("java")%> </p>
        
    </body>
</html>
