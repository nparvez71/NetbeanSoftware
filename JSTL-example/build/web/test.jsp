<%-- 
    Document   : test
    Created on : Dec 19, 2017, 11:15:37 AM
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
         <c:set var="browser" value="${header['User-Agent']}" scope="session" />
        your browser User Agent is: <c:out value="${browser}"/>
    </body>
</html>
