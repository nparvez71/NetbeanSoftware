<%-- 
    Document   : index
    Created on : Jan 11, 2018, 12:22:35 PM
    Author     : J2EE-33
--%>
<%@page import="com.parvez.Countries" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tag with Classic tag!</h1>
        <%@taglib uri="/WEB-INF/tlds/ch07.tld" prefix="ch07"%>
        <%
        pageContext.setAttribute("countries", Countries.getInstance().getCountries());
        %>
        Countryyyy::
        <ch07:select name="country" label="id" value="name" items="${countries}"/>
        
        
        
    </body>
</html>
