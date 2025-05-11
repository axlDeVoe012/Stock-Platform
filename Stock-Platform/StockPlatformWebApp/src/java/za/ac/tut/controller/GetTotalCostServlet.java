/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.StockItemFacadeLocal;

/**
 *
 * @author Administrator
 */
public class GetTotalCostServlet extends HttpServlet {
    @EJB StockItemFacadeLocal sfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        
            Double totalCost = sfl.getTotalCost(id);
            request.setAttribute("totalCost", totalCost);
            
            Double retailPrice = sfl.getTotalRetail(id);
            request.setAttribute("retailPrice", retailPrice);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("total_cost_outcome.jsp");
        disp.forward(request, response);
    }

}
