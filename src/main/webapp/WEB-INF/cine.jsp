<%-- 
    Document   : clienteAnadido
    Created on : 18-feb-2018, 19:07:33
    Author     : rosa_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cine: </h1>
        <p>
            ${cine.id}
            ${cine.nombre}
            ${cine.direccion}
        </p>
  
        <a href="./${cine.id}/peliculas">Ver películas</a>
    </body>
</html>
