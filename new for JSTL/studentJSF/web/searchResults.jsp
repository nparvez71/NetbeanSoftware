<%-- 
    Document   : searchResult2
    Created on : Jan 9, 2018, 12:31:04 PM
    Author     : J2EE-33
--%>
 <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <f:view>
        <head>               
         <title>Freedom Airlines Online Flight Reservation System</title>
         <link rel="stylesheet" href="projsp.css">
      </head>
      <body>
            <h3>You entered these search parameters</h3>
            <p>ID <h:outputText value="#{studentController.student.id}"/>
            <p> Name: <h:outputText value="#{studentController.student.name}"/>
           
      </body>      
   
       </f:view>
    
</html>
