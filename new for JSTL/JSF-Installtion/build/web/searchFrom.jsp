<%-- 
    Document   : searchFrom
    Created on : Dec 23, 2017, 12:29:39 PM
    Author     : J2EE-33
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>@
<!DOCTYPE html>
<html>
    <f:view>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Freedom Airlines Flight </title>
    </head>
    <body>
       
        <h1>Hello World!</h1>
        <h:form>
            <h2>Search Flights</h2> 
            <table>
                <tr><td colspan="4">Where and when u gooo</td></tr>
                <tr>
                    <td colspan="2">lEAVING FROM:</td>
                      <td colspan="2">Going to</td>
                </tr> 
                <tr>
                    <td colspan="2">
                        <h:inputText value="#{flight.origination}" size="35"/>
                    </td>
                     <td colspan="2">
                         <h:inputText value="#{flight.destination}" size="35"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">Departing</td>
                    <td colspan="2">Resulting</td>
                </tr>
                <td>
                    <h:inputText value="#{flight.departDate}"/>
                </td>
                 <td>
                     <h:inputText value="#{flight.depatTime}"/>
                </td>
                 <td>
                     <h:inputText value="#{flight.returnDate}"/>
                </td>
                 <td>
                     <h:inputText value="#{flight.returnTime}"/>
                </td>
            </table>
                <p>
                    <h:commandButton value="Search" action="Submit"/>
                </p>
        </h:form>
    </body>
    </f:view>
</html>
