<%-- 
    Document   : index
    Created on : Dec 20, 2017, 9:29:02 AM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.parvez.Test" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="person" class="com.parvez.Person" scope="request">
    <jsp:setProperty name="person" property="*"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

<table border="3">
            <tr>  
                <td>${person.name}</td>
                <td>&nbsp;</td>
            </tr>
            <tr> 
            <form action="index.jsp" method="post">
                <td>Name: <input type="text" name="name"></td>
                <td> <input type="submit" value="gooo"></td>
            </form>
        </tr>
    </table>


        
        
        
        <% Test p = new Test();
            pageContext.setAttribute("pppp", p);

        %>
        <table border="3">
            <tr>
                <th> Name </th>
                  <th> Id </th>
                <th> address</th>
            </tr>
            <c:forEach items="${pppp.list}" var="p">
                <tr>
                    <td>
                        <c:out value="${p.name}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
