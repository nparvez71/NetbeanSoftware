<%-- 
    Document   : indoor
    Created on : Dec 19, 2017, 10:48:32 AM
    Author     : J2EE-33
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="sum" value="${200+300}" scope="session" />
         Before: <c:out value="${sum}"/>
        <c:remove var="sum" />
        After:: <c:out value="${sum}"/>
        
    </body>
</html>
