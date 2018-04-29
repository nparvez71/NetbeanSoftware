<%-- 
    Document   : implicit
    Created on : Dec 18, 2017, 12:32:30 PM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="sessionperson" class="com.parvez.Person" scope="session"/>
  
<jsp:useBean  id="requestperson" class="com.parvez.Person" scope="request"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <tr>
                <td>Concept</td>
                <td>Code</td>
                <td>OutPut</td>

            </tr>

            <tr>
                <td>pageContext</td>
                <td>${'${'}pageContext.request.requestURI}</td>
                <td>${pageContext.request.requestURI}</td>

            </tr>
            <tr>
                <td>sessionScope</td>
                <td>${'${'}sessionScope.sessionperson.name}</td>
                <td>${sessionScope.sessionperson['age']}</td>

            </tr>
                <tr>
                <td>requestScope</td>
                <td>${'${'}requestScope.requestperson.name}</td>
                <td>${requestScope.requestperson.name}</td>

            </tr>
            <tr>
                <td>param</td>
                <td>${'${'}param["name"]}</td>
                <td>${param["name"]}</td>

            </tr>
            <tr>
                <td>paramValues</td>
                <td>${'${'}paramValues.multi[1]}</td>
                <td>${paramValues["name"]}</td>

            </tr>
            
        </table>
    </body>
</html>
