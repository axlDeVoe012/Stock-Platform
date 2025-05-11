/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entities.StockItem;

/**
 *
 * @author Shaun Mabasa
 */
@Local
public interface StockItemFacadeLocal {

    void create(StockItem stockItem);

    void edit(StockItem stockItem);

    void remove(StockItem stockItem);

    StockItem find(Object id);

    List<StockItem> findAll();

    List<StockItem> findRange(int[] range);

    int count();
    
    List<StockItem> getByCreationDate(Date creationDate);
    
    Integer getTotalQuantity();
    
    List<StockItem> getByRange(Integer min,Integer max);
    
    
}
