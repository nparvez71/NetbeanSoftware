<%-- 
    Document   : index
    Created on : Dec 20, 2017, 9:53:08 AM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Hello World!</h1>
        
        
     
        <c:forEach var= "i" begin="100" end="200" step="1">
            
           ${i}
        </c:forEach>
    

