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
        <form method="post" action="view">
            Enter Customer ID : <input type="text" name="cid"/>
            Enter Customer Name : <input type="text" name="cname"/>
            Enter Customer Email Address : <input type="email" name="cemail"/>
            <input type="submit" value="Submit"/>
        </form>
        </body>
    </html>
</f:view>
