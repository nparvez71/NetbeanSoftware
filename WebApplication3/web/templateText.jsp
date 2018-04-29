<%-- 
    Document   : index
    Created on : Dec 18, 2017, 9:41:16 AM
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
        <h2> El template text</h2>
        <table border="1">
            <tr>
                <td colspan="2">Hello ${param['fname']}+${param['lname']}</td>
            </tr>
            <tr>  
            <form action="templateText.jsp" method="post">
                <td><input type="text" name="fname">  </td>
                <td><input type="text" name="lname">  </td>
                <td><input type="submit" value="go">  </td>
            </form>
        </tr>
    </table>
</body>
</html>
