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
        <h1>Cines: </h1>

            <ol>
                <li>Id</li>
                <li>Nombre</li>
                <li>Direccion</li>
            </ol>
            <c:forEach items="${cines}" var="cine">
                <ul>
                    <li>
                        <c:out value="${cine.id}" />
                    </li>
                    <li>
                        <c:out value="${cine.nombre}" />
                    </li>
                    <li>
                        <c:out value="${cine.direccion}" />
                    </li>
                    <li>
                        <a href="cines/${cine.id}">Ver cine</a>
                    </li>
                </ul>   
                <br>
            </c:forEach>

    </body>
</html>
