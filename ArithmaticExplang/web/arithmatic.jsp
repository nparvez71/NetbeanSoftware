<%-- 
    Document   : arithmatic
    Created on : Dec 18, 2017, 11:17:37 AM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="2"> 
            <tr>  
                <td> <b> Concept</b></td>
                <td> <b> EL Expression</b></td>
                <td> <b> Result</b></td>
            </tr>
            <tr>  
                <td>  Literal</td>
                <td> ${'${'}10}</td>
                <td> ${10}</td>
            </tr>
            <tr>  
                <td>  addition</td>
                <td> ${'${'}10+10}</td>
                <td> ${10+10}</td>
            </tr>
            <tr>  
                <td>  subtraction</td>
                <td> ${'${'}15-10}</td>
                <td> ${15-10}</td>
            </tr>
            <tr>  
                <td>  multiple</td>
                <td> ${'${'}5*10}</td>
                <td> ${5*10}</td>
            </tr>
            <tr>  
                <td>  division</td>
                <td> ${'${'}15/3}</td>
                <td> ${15/3}</td>
            </tr>
            <tr>  
                <td>  division Div</td>
                <td> ${'${'}15 div 3}</td>
                <td> ${15 div 3}</td>
            </tr>

            <tr>  
                <td>  division 000</td>
                <td> ${'${'}15/0}</td>
                <td> ${15/0}</td>
            </tr>
            
              <tr>  
                <td>  modulas Div</td>
                <td> ${'${'}150 mod 10}</td>
                <td> ${150 mod 10}</td>
            </tr>

            <tr>  
                <td>  persentise </td>
                <td> ${'${'}12*5%13}</td>
                <td> ${12*5%13}</td>
            </tr>
        </table>
            <h2><a href="http://localhost:8080/JavaBean/index.jsp">Click me</a></h2>
             <h1><a href="http://localhost:8080/comparisionsExpLang/newjsp.jsp">Click me2</a></h1>
            
    </body>
</html>
