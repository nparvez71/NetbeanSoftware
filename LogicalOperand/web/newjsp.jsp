<%-- 
    Document   : newjsp
    Created on : Dec 18, 2017, 11:52:01 AM
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
                <td>  And</td>
                <td> ${'${'}true and true}</td>
                <td> ${true and true} </td>
            </tr>   
            
             <tr>  
                <td>  And</td>
                <td> ${'${'}true && true}</td>
                <td> ${true && true} </td>
            </tr>  
              <tr>  
                <td>  And</td>
                <td> ${'${'}true or true}</td>
                <td> ${true or true} </td>
            </tr>  
            
            
             <tr>  
                <td>  And</td>
                <td> ${'${'}true and false}</td>
                <td> ${true and false} </td>
            </tr>   
              <tr>  
                <td>  And</td>
                <td> ${'${'}true && false}</td>
                <td> ${true && false} </td>
            </tr>  
             <tr>  
                <td>  And</td>
                <td> ${'${'}true or false}</td>
                <td> ${true or false} </td>
            </tr>  
            
             <tr>  
                <td>  Or</td>
                <td> ${'${'}true || false}</td>
                <td> ${true || false} </td>
            </tr> 
            <tr>  
                <td>  Not</td>
                <td> ${'${'} not true }</td>
                <td> ${not true} </td>
            </tr> 
             <tr>  
                <td>  Not</td>
                <td> ${'${'} ! false }</td>
                <td> ${! false} </td>
            </tr> 
        </table>
        
    </body>
</html>
