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
 * @author Future
 */
public class GetTotalItemsServlet extends HttpServlet {
    @EJB 
    private StockItemFacadeLocal sfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long total = sfl.getTotalQuantity();
        
        request.setAttribute("total", total);
        RequestDispatcher disp = request.getRequestDispatcher("total_items_outcome.jsp");
        disp.forward(request, response);
    }

    

}
