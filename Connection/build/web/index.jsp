<%-- 
    Document   : index
    Created on : Dec 13, 2017, 12:54:22 PM
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
        <form action="SaveServlet" method="post">
            <input type="submit" value="Save Page"/>
                 </form>
         <form action="EditServlet" method="post">
                <input type="submit" value="Edit Page"/>
        </form>
    </body>
</html>
