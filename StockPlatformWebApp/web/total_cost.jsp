<%-- 
    Document   : total_cost
    Created on : 11 May 2025, 6:42:14 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total Cost Page</title>
    </head>
    <body>
        <h1>Get total cost</h1>
        <p>
            Enter the id of the product.
        </p>
        <form action="GetTotalCostServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID: </td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET TOTAL COST"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
