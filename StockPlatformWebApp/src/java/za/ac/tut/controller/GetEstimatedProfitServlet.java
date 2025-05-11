/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
 * @author Cornad Architectural
 */
public class GetEstimatedProfitServlet extends HttpServlet {
    
    @EJB
    StockItemFacadeLocal sil;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<StockItem> stockItems = sil.findAll();
        Double profit = estimateProfit(stockItems);
        
        request.setAttribute("profit", profit);
        
        RequestDispatcher disp = request.getRequestDispatcher("estimate_profit_outcome.jsp");
        disp.forward(request, response);
    }

    private Double estimateProfit(List<StockItem> stockItems) {
        
        Double profit = 0.0;
        Double totalCost = 0.0;
        Double totalRetail = 0.0;
        for(StockItem item: stockItems)
        {
            totalCost += item.getQuantity() * item.getUnitPrice();
            totalRetail += item.getQuantity() * item.getRetailPrice();
        }
        
        profit = totalRetail - totalCost;
        
        return profit;
    }

    

}
