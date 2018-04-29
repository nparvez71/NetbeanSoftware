<%-- 
    Document   : index
    Created on : Dec 21, 2017, 9:37:45 AM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="en_GB" scope="request"/>
<fmt:setBundle basename="labels"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2> Servey</h2>
        <form action="">
            <table>
                <tr>
                    <td> <fmt:message key="nameQuestion"/></td>
                    <td> <input type="text" size="18"/></td>
                </tr>
                <tr>
                    <td> <fmt:message key="ageQuestion"/></td>
                    <td> <input type="text" size="18"/></td>
                </tr>
                <tr>
                    <td> <fmt:message key="locationQuestion"/></td>
                    <td> <input type="text" size="18"/></td>
                </tr>
                <tr>
                    <td> <input type="submit" value='<fmt:message key="submit"/>'></td>

                </tr>
            </table>

        </form>
    </body>
</html>
