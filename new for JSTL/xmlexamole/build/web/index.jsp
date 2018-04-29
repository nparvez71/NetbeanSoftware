<%-- 
    Document   : index
    Created on : Dec 21, 2017, 1:02:04 PM
    Author     : J2EE-33
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<c:import var="bookinfo" url="https://www.w3schools.com/xml/note.xml"/>
<x:parse xml="${bookinfo}" var="book" scope="session"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <b> Date Info:</b>
        To:<x:out select="$book/note[1]/to"/><br/>
         From:<x:out select="$book/note[1]/from"/><br/>
          Contact:<x:out select="$book/note[1]/contact"/><br/>
          Body:<x:out select="$book/note[1]/body"/>
    </body>
</html>
