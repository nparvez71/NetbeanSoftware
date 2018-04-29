<%-- 
    Document   : index
    Created on : Dec 18, 2017, 12:07:39 PM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="person" class="com.parvez.Person" scope="request">
    <jsp:setProperty name="person" property="*"/>
</jsp:useBean>

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
                <td> ${person.age}</td>
                <td>&nbsp;</td>
            </tr>
            <tr> 
            <form action="index.jsp" method="post">
                <td>Name: <input type="text" name="name"></td>
                     <td>Age: <input type="text" name="age"></td>
                 <td> <input type="submit" value="gooo"></td>
                
            </form>
            </tr>
    </table>
        
    </body>
</html>
