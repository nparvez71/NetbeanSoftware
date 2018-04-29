<%-- 
    Document   : index
    Created on : Dec 21, 2017, 10:34:26 AM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="now" class="java.util.Date"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2> Default Time zone</h2>
        Default format: <fmt:formatDate value="${now}"/><br>
        A Date formate dd/MM/YYYY :
        <fmt:formatDate value="${now}" type="DATE" pattern="dd/MM/YYYY"/><br>
          A time formate medium :
          <fmt:formatDate value="${now}" type="TIME" dateStyle="MEDIUM"/><br>
          A Date and time formate  :
          <fmt:formatDate value="${now}" type="BOTH" dateStyle="FULL" timeStyle="FULL"/><br>
          <hr>
          
          <h2> America/LOS_Angeles Time zone</h2>
          <fmt:timeZone value="America/LOS_Angeles">
        Default format: <fmt:formatDate value="${now}"/><br>
        A Date formate MM-dd-YYYY :
        <fmt:formatDate value="${now}" type="DATE" pattern="MM-dd-YYYY "/><br>
          A time formate medium :
          <fmt:formatDate value="${now}" type="TIME" dateStyle="MEDIUM"/><br>
          A Date and time formate  :
          <fmt:formatDate value="${now}" type="BOTH" dateStyle="FULL" timeStyle="FULL"/><br>
          </fmt:timeZone>
    </body>
</html>
