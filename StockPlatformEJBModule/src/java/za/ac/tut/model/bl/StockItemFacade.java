/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entities.StockItem;

/**
 *
 * @author Shaun Mabasa
 */
@Stateless
public class StockItemFacade extends AbstractFacade<StockItem> implements StockItemFacadeLocal {

    @PersistenceContext(unitName = "StockPlatformEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StockItemFacade() {
        super(StockItem.class);
    }

    @Override
    public List<StockItem> getByCreationDate(Date creationDate) {
        String queryStr = "SELECT s FROM StockItem s WHERE s.creationDate =:creationDate";
        Query query = em.createQuery(queryStr);
        query.setParameter("creationDate", creationDate);
        List<StockItem> items = query.getResultList();
        return items;
    }

    @Override
    public Long getTotalQuantity() {
        String queryStr = "SELECT COUNT(s.quantity) FROM StockItem s";
        Query query = em.createQuery(queryStr);
        Long totalQuantity = (Long) query.getSingleResult();
        return totalQuantity;
    }

    @Override
    public List<StockItem> getByRange(Integer min, Integer max) {
        
         String queryStr = "SELECT s FROM StockItem s WHERE s.quantity >= :min AND s.quantity <= :max";

         Query query = em.createQuery(queryStr);
         query.setParameter("min", min);
         query.setParameter("max", max);
         List<StockItem> items = query.getResultList();
         return items;
    }

    @Override
    public Double getTotalCost(Long id) {
       Query query = em.createQuery("SELECT s FROM StockItem s WHERE s.id = :id");
       query.setParameter("id", id);
       StockItem si = (StockItem)query.getSingleResult();
       Double unitPrice = si.getUnitPrice();
       Integer quantity = si.getQuantity();
       Double totalCost = unitPrice*quantity;
       return totalCost;
    }

    @Override
    public StockItem getByItemName(String itemName) {
        String queryStr = "SELECT s FROM StockItem s WHERE s.itemName = :itemName";
        Query query = em.createQuery(queryStr);
        query.setParameter("itemName", itemName);
        
        StockItem item = (StockItem)query.getSingleResult();
        
        return item;
    }

    @Override
    public Double getTotalRetail(Long id) {
        String queryStr = "SELECT s FROM StockItem s WHERE s.id = :id";
        Query query = em.createQuery(queryStr);
        query.setParameter("id", id);
        
        StockItem si = (StockItem)query.getSingleResult();
        Double retailPrice = si.getRetailPrice();
        Integer quantity = si.getQuantity();
        
        Double totalRetail = retailPrice*quantity;
        
        return totalRetail;
    }
    
}
  