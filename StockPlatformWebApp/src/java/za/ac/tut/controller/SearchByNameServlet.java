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
import za.ac.tut.model.entities.StockItem;

/**
 *
 * @author Future
 */
public class SearchByNameServlet extends HttpServlet {
    @EJB
    private StockItemFacadeLocal sfl;
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String itemName = request.getParameter("name");
        
        StockItem item = sfl.getByItemName(itemName);
        request.setAttribute("item", item);
        
        RequestDispatcher disp = request.getRequestDispatcher("search_by_name_outcome.jsp");
        disp.forward(request, response);
    }

    

}
