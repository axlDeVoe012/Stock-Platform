<%-- 
    Document   : total_cost_outcome
    Created on : 11 May 2025, 7:05:13 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total Cost Outcome Page</title>
    </head>
    <body>
        <h1>Total cost</h1>
        <%
            Double totalCost = (Double)request.getAttribute("totalCost");
            Double retailPrice = (Double)request.getAttribute("retailPrice");
        %>
            <p>
                The total cost is : <b>R<%=totalCost%></b>, and the retail price is: <b>R<%=retailPrice%></b>
            </p>   
             <p>
                   
           Click <a href="menu.html">here</a> to access the main menu or <a href="index.html">here </a>to access the home page 
        </p>
    </body>
</html>
