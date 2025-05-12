<%-- 
    Document   : filter_by_range_outcome
    Created on : May 12, 2025, 3:18:59 PM
    Author     : Cornad Architectural
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entities.StockItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Filter By Range Page</title>
    </head>
    <body>
        <h1>Filter By Range</h1>
        <p>Here are the desired results: </p>
                <table border="2" width="50%" >
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
        </thead>  
        <%
            List<StockItem> list = (List<StockItem>)request.getAttribute("items");
            
            for(int i = 0; i < list.size() ; i++){
                
                StockItem p = list.get(i);
                
                Long id = p.getId();
                String itemName= p.getItemName();
                String description = p.getDescription();
                Integer quantity = p.getQuantity();
                Date date = p.getCreationDate();
                Double retailPrice= p.getRetailPrice();
                Double unitPrice =p.getUnitPrice();
                
        %>
        
       
        <tr>
            <td><%=id%></td>
            <td><%=itemName%></td>
            <td><%=description%></td>
            <td><%=quantity%></td>
            
            <td>R<%=unitPrice%></td>
            <td>R<%=retailPrice%></td>
            <td><%=date%></td>
        </tr>
            <%
                }
            %>
        </table> 
        <p>
                   
           Click <a href="menu.html">here</a> to access the main menu or <a href="index.html">here </a>to access the home page 
        </p>
    </body>
    </body>
</html>
