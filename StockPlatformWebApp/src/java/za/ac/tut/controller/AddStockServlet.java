/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.StockItemFacadeLocal;
import za.ac.tut.model.entities.StockItem;

/**
 *
 * @author Siyabonga-Phiri
 */
public class AddStockServlet extends HttpServlet {

 @EJB
 StockItemFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id = Long.parseLong(request.getParameter("id"));
        String itemName=request.getParameter("itemName");
        String description = request.getParameter("description");
        Integer quantity =Integer.parseInt(request.getParameter("quantity")) ;
        Double retailPrice = Double.parseDouble(request.getParameter("retailPrice"));
        Double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
      
        StockItem item = createStock(id,itemName, description, quantity, retailPrice,unitPrice);
        sfl.create(item);
        
        request.setAttribute("itemName",itemName);
        
        RequestDispatcher rd = request.getRequestDispatcher("add_stock_outcome.jsp");
        rd.forward(request, response);
        
    }

    private StockItem createStock (Long id,String itemName,String description,int quantity,double retailPrice,double unitPrice){
    
    StockItem item = new StockItem();
    item.setId(id);
    item.setItemName(itemName);
    item.setRetailPrice(retailPrice);
    item.setUnitPrice(unitPrice);
    item.setDescription(description);
    item.setQuantity(quantity);
    item.setCreationDate(new Date());
    
    return item;
    
    
        
    } 
}
