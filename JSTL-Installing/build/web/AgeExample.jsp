<%-- 
    Document   : AgeExample
    Created on : Dec 20, 2017, 9:11:38 AM
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
        <h1>AGE   !</h1>
        <c:set var="age" value="${25}" scope="session"/>
        <c:when test="${age>=18}"/>
         <c:out value=" u r eq or more 18"/>
         <c:otherwise/> 
        <c:out value=" u r not 18"/>
    </body>
</html>
