< xmlns:form xmlns:form="http://www.springframework.org/tags/form"="http://www.springframework.org/tags/form"/>%--
    Document   : courses.jsp
    Created on : Feb 3, 2020, 10:36:06 AM
    Author     : Omali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>TripleC++ courses</title>
        </head>
        <body>
        <h1>View Customer Details</h1>
        <h2>Details as submitted as follows: </h2>
        <form method="post" action="getdetails">
            Enter Customer ID : <input type="text" name="cid"/>
            <input type="submit" value="Submit"/>
        </form>
        </body>
    </html>
</f:view>
