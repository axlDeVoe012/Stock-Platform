<%-- 
    Document   : total_items_outcome
    Created on : 11 May 2025, 10:34:51 PM
    Author     : Future
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total quantity Page</title>
    </head>
    <body>
        <h1>Total quantity</h1>
        <%
            Long totalQuantity = (Long)request.getAttribute("total");
        %>
        <p>
            The total quantity of items is <b><%=totalQuantity%></b>.
            <br>
             Click <a href="menu.html">here</a> to access the main menu or <a href="index.html">here </a>to access the home page. 
        </p>
    </body>
</html>
