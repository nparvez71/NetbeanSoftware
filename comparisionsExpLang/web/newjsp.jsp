<%-- 
    Document   : newjsp
    Created on : Dec 18, 2017, 11:34:24 AM
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
        
        <table border="3"> 
        
       <tr>  
                <td> <b> Concept</b></td>
                <td> <b> EL Expression</b></td>
                <td> <b> Result</b></td>
            </tr>
        
            <tr>  
                <td>  numeric less than</td>
                <td> ${'${'}1 &LT; 2}</td>
                <td> ${1<2} </td>
            </tr>
             <tr>  
                <td>  numeric greater than</td>
                <td> ${'${'}1 &GT; 2}</td>
                <td> ${1>2} </td>
            </tr>
            
             <tr>  
                <td>  numeric less than</td>
                <td> ${'${'}1 Lt 2}</td>
                <td> ${1 lt 2} </td>
            </tr>
             <tr>  
                <td>  numeric greater than</td>
                <td> ${'${'}1 Gt 2}</td>
                <td> ${1 gt 2} </td>
            </tr>
             <tr>  
                <td>  numeric less than</td>
                <td> ${'${'}1 &Lt;= 2}</td>
                <td> ${1<2} </td>
            </tr>
             <tr>  
                <td>  numeric greater than</td>
                <td> ${'${'}1 &GT;= 2}</td>
                <td> ${1>2} </td>
            </tr>
            
             <tr>  
                <td>  numeric less than</td>
                <td> ${'${'}1 Le 2}</td>
                <td> ${1 le 2} </td>
            </tr>
             <tr>  
                <td>  numeric greater than</td>
                <td> ${'${'}1 ge 2}</td>
                <td> ${1 ge 2} </td>
            </tr>
            
            
        </table>
    </body>
</html>
