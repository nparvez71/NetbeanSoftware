<%-- 
    Document   : action
    Created on : Dec 10, 2017, 1:07:39 PM
    Author     : J2EE-33
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.Redirect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
          <%= "Name: "+request.getParameter("fastname") %>
          
          <%= "AGE: "+request.getParameter("age") %>
           <%= "text "+request.getParameter("n") %>
           <%= "EMail "+request.getParameter("email") %>
           
           
          <!--  response.sendRedirect("http://www.google.com"); --> 
    </body>
</html>
