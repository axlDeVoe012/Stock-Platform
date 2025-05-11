<%-- 
    Document   : view_stock_outcome
    Created on : May 11, 2025, 12:59:02 AM
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
        <title> view Stock Outcome Page</title>
    </head>
    <body>
        <h1> view Stock</h1>
        
        <p>
            Below are the items that are in the database :
        </p>
       
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
            List<StockItem> list = (List<StockItem>)request.getAttribute("list");
            
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
       
    </body>
</html>
