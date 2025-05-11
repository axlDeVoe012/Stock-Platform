/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Shaun Mabasa
 */
@Entity
@Table(name = "Stock_Items")
public class StockItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    @Column(name="NAME")
    private String itemName;
    private String description;
    private Integer quantity;
    @Column(name="UNIT_PRICE")
    private Double unitPrice;
    @Column(name="RETAIL_PRICE")
    private Double retailPrice;
    @Column(name="CREATION_DATE")
    private Date creationDate;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public StockItem(Long id, String itemName, String description, Integer quantity, Double unitPrice, Double retailPrice, Date creationDate) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.retailPrice = retailPrice;
        this.creationDate = creationDate;
    }

    public StockItem() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockItem)) {
            return false;
        }
        StockItem other = (StockItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.model.entities.StockItem[ id=" + id + " ]";
    }
    
}
