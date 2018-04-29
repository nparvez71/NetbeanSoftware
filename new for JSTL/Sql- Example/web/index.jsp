<%-- 
    Document   : index
    Created on : Dec 21, 2017, 11:47:43 AM
    Author     : J2EE-33
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/tempdb" user="root" password="1234"/>
   
        
          <sql:update var="users" dataSource="${dataSource}">
       
      UPDATE user SET firstname = 'Farhan'WHERE ID =119;
        </sql:update>
      
      
      <sql:query var="users" dataSource="${dataSource}">
       
    select * from user where id=119
      </sql:query>
       <table>
                 <c:forEach var="row" items="${users.rows}">
                     <tr>
                     <td><c:out value="${row.firstname}"/></td>
                     <td><c:out value="${row.lastname}"/></td>
                     <td><c:out value="${row.phone}"/></td>
                 </tr>
                     
                 </c:forEach>
                 
             </table>

      

    </body>
</html>
