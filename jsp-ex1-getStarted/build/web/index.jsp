<%-- 
    Document   : index
    Created on : Dec 10, 2017, 12:52:09 PM
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
        <h1>Data read from index page</h1>
        <%!
            String fname = "NUR";
            String lname = "MOHAMMAD";
        %>
        <%=  "First nmae: " + fname%>       
        <% out.println("Last name: " + lname);
        %>
        <% int x = 10;
            int y = 50;
            int sum = x + y;
            out.println(" Sum:" + sum);
        %>
        <%="sum :::" + sum%>
        <%! int x = 20;
        %> 
        <%="x:" + x%>
        <form action="action.jsp" method="POST">
            <input type="text" name="fastname"/>
            <input type="number" name="age"/>
             <input type="text" name="n"/>
            <input type="email" name="email"/>
            <input type="submit" value="send"/>    
        </form>
    </body>
</html>
