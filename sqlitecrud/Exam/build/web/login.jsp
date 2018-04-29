<%-- 
    Document   : login
    Created on : Mar 4, 2018, 9:53:22 AM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:form action="login">
            <s:textfield name="name" label="name"/>
            <s:password name="password" label="password"/>
            <s:submit value="login"/>
        </s:form>
         <s:a href="registration.jsp">Registration page</s:a>
    </body>
</html>
