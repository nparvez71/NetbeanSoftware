<%-- 
    Document   : newjspLogin
    Created on : Jan 18, 2018, 9:28:16 AM
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
        <form id="loginForm" method="post" action="j_security_check">
            <p>UserName: <input type="text" name="j_username" id="j_username"><br/>
                password:<input type="password" name="j_password"/><br/>
                <button type="submit">login</button>
            
            </p>
        </form>
    </body>
</html>
