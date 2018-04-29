<%-- 
    Document   : registration
    Created on : Mar 4, 2018, 9:53:39 AM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <h1>Registration page!</h1>
        <s:form action="reg">
            <s:textfield name="name" label="Name"/>
       
            <s:password name="password" label="Password"/>
            <s:submit value="Register"></s:submit>
        </s:form>
    </body>
</html>
