<%-- 
    Document   : estimate_profit_outcome
    Created on : 11 May 2025, 9:59:38 AM
    Author     : Shaun Mabasa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estimate Profit Outcome Page</title>
    </head>
    <body>
        <h1>Estimate Profit Outcome</h1>
        <%
            Double profit = (Double) request.getAttribute("profit");
        %>
        <p>The estimated profit based on the available stock is <b>R<%=profit%></b>
        <br>
           Click <a href="menu.html">here</a> to access the main menu or <a href="index.html">here </a>to access the home page
        </p>
    </body>
</html>
