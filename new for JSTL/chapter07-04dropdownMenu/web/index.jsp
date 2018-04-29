<%-- 
    Document   : index
    Created on : Jan 11, 2018, 11:04:39 AM
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
        <h1>Chap07-Country dropDown!</h1>
        <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
        
        <%
            pageContext.setAttribute("countries", Countries.getInstance().getCountries());
            %>
            Countries:
            <select name="country">
                <c:forEach var="country" items="${countries}" >
                    <option value="${country.id}">${country.name}</option>
                </c:forEach>
            </select>
    </body>
</html>
