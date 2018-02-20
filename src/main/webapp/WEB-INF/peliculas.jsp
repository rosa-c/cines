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
        <h1>Peliculas: </h1>

            <ol>
                <li>Id</li>
                <li>Titulo</li>
                <li>Descripcion</li>
            </ol>
            <c:forEach items="${peliculas}" var="pelicula">
                <ul>
                    <li>
                        <c:out value="${pelicula.id}" />
                    </li>
                    <li>
                        <c:out value="${pelicula.titulo}" />
                    </li>
                    <li>
                        <c:out value="${pelicula.descripcion}" />
                    </li>
                    <li>
                        <a href="./peliculas/${pelicula.id}">Ver pelicula</a>
                    </li>
                </ul>   
                <br>
            </c:forEach>

    </body>
</html>
