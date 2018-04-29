<%-- 
    Document   : Catch
    Created on : Dec 19, 2017, 12:53:03 PM
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
        <h1>Hello World! catch expression</h1>
        <c:catch var="exception">
            <% int n=10/2;%>
        </c:catch>
        <c:if test="${exception !=null}">
            <c:out value="not okkkkkk"/>
            
        </c:if>
        
    </body>
</html>
