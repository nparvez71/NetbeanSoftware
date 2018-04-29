<%-- 
    Document   : index
    Created on : Dec 12, 2017, 9:34:06 AM
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
        <form action="NewServlet" method="POST">
            <div>Name:<input type="text" name="name" /></div>
            <input type="submit" value="save" />
        </form>
    </body>
</html>
