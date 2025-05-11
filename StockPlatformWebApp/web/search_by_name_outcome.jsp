<%-- 
    Document   : search_by_name_outcome
    Created on : 11 May 2025, 9:52:26 PM
    Author     : Future
--%>

<%@page import="java.util.Date"%>
<%@page import="za.ac.tut.model.entities.StockItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search By Name Outcome Page</title>
    </head>
    <body>
        <h1>Search by name outcome</h1>
        <%
            StockItem item = (StockItem)request.getAttribute("item");
            String itemName = item.getItemName();
            String description = item.getDescription();
            Long id = item.getId();
            Integer quantity = item.getQuantity();
            Double unitPrice = item.getUnitPrice();
            Double retailPrice = item.getRetailPrice();
            Date date = item.getCreationDate();
        %>
        <table border="2" width="50%">
            <thead>
                <tr>
                    <td><b>Item ID</b></td>
                    <td><b>Name</b></td>
                    <td><b>Description</b></td>
                    <td><b>Quantity</b></td>

                    <td><b>Unit Price</b></td>
                    <td><b>Retail Price</b></td>
                    <td><b>Creation Date</b></td>
                </tr>
                <tr>
                    <td><b><%=id%></b></td>
                    <td><b><%=itemName%></b></td>
                    <td><b><%=description%></b></td>
                    <td><b><%=quantity%></b></td>

                    <td><b><%=unitPrice%></b></td>
                    <td><b><%=retailPrice%></b></td>
                    <td><b><%=date%></b></td>
                </tr>
            </thead> 
        </table>
        <p>
                   
           Click <a href="menu.html">here</a> to access the main menu or <a href="index.html">here </a>to access the home page 
        </p>
    </body>
</html>
