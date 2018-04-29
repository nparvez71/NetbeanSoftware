<%-- 
    Document   : searchFrom2
    Created on : Jan 9, 2018, 12:20:44 PM
    Author     : J2EE-33
--%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <f:view>
         <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
      <h2>Student</h2>
      <table>
        <tr><td colspan="4">Where and when do you want to travel?</td></tr>
        <tr>
          <td colspan="2">Leaving from:</td>
          <td colspan="2">Going to:</td>
        </tr>
        <tr>
          <td colspan="2">
              <h:inputText value="#{studentController.student.id}" size="35"/>
          </td>
          <td colspan="2">
              <h:inputText value="#{studentController.student.name}" size="35"/>
          </td>
        </tr>
       
        
      </table>
      <p>
      <h:commandButton value="Search" action="submit"/>
      </p>
    </h:form>
   </body>
    </body>
    </f:view>
</html>
