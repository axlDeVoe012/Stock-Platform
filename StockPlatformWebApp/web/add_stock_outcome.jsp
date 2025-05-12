<%-- 
    Document   : add_stock_outcome
    Created on : May 10, 2025, 11:53:36 PM
    Author     : Siyabonga-Phiri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Stock Page</title>
    </head>
    <body>
        <h1>Add Stock</h1>
        <p>
           <%
           String name = (String)request.getAttribute("itemName");
           %>
           <%=name%> has been added to the database
            <br>
            Click <a href="menu.html">here</a> to access the main menu or <a href="index.html">here </a>to access the home page
        </p>
    </body>
</html>
