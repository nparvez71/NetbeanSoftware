<%-- 
    Document   : searchResult
    Created on : Dec 23, 2017, 12:28:44 PM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html>
<html><f:view>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservation System</title>
    </head>
    <body>
        <h1>You entered ur search</h1>
        <p>Origination:<h:outputText value="#{flight.origination}"/>
        <p>Depart data:<h:outputText value="#{flight.departDate}"/>
        <p>Depart Time<h:outputText value="#{flight.depatTime}"/>
        <p>Destination:<h:outputText value="#{flight.destination}"/>
        <p>Return Data<h:outputText value="#{flight.returnDate}"/>
        <p>Return time<h:outputText value="#{flight.returnTime}"/>
           
    </body></f:view>
</html>
