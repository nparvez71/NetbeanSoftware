<%-- 
    Document   : Ifjsp
    Created on : Dec 19, 2017, 12:10:50 PM
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
        <c:set var="salary" value="${15000}" scope="session" />
        ur salary more than 1000 and it is
        <c:if test="${salary < 10000}">

            <c:out value="${salary}"/>
        </c:if>
        <c:choose>
            <c:when test="${salary > 1000}">
                <c:out value="Good salary"/>
            </c:when>
            <c:when test="${salary > 2000}">
                <c:out value="Very Good salary"/>
            </c:when>
            <c:when test="${salary > 10000}">
                <c:out value="Wow extrem salary"/>
            </c:when>
            <c:otherwise>
                <c:out value="Low salary"/>
            </c:otherwise>
        </c:choose>

    </body>
</html>
