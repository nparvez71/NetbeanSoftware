<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>First  wellcome Page</title>
    </head>

    <body>
        <h1><s:property value="name"/>
        <s:property value="note"/>
        </h1>
        <s:form action="abc" method="POST" >
            <s:textfield name="name"/>
            <s:submit value="submit"/>
                      
        </s:form>
    </body>
</html>

