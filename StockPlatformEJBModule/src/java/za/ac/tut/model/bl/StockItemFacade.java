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
    public Integer getTotalQuantity() {
        String queryStr = "SELECT COUNT(s.quantity) FROM StockItem s";
        Query query = em.createQuery(queryStr);
        Integer totalQuantity = (Integer) query.getSingleResult();
        return totalQuantity;
    }

    @Override
    public List<StockItem> getByRange(Integer min, Integer max) {
        
         String queryStr = "SELECT s FROM StockItem s WHERE s.quantity >=:min AND max:<= s.quantity";
         Query query = em.createQuery(queryStr);
         query.setParameter("min", min);
         query.setParameter("max", max);
         List<StockItem> items = query.getResultList();
         return items;
    }
    
}
