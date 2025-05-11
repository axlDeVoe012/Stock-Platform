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
public class ViewStockServlet extends HttpServlet {

    
    @EJB
 StockItemFacadeLocal sfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        List<StockItem> list = sfl.findAll();
        
        request.setAttribute("list", list);
        
        
         RequestDispatcher rd = request.getRequestDispatcher("view_stock_outcome.jsp");
        rd.forward(request, response);
    }

   
}
