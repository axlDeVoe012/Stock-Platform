package za.ac.tut.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-11T22:50:55")
@StaticMetamodel(StockItem.class)
public class StockItem_ { 

    public static volatile SingularAttribute<StockItem, Double> unitPrice;
    public static volatile SingularAttribute<StockItem, String> itemName;
    public static volatile SingularAttribute<StockItem, Integer> quantity;
    public static volatile SingularAttribute<StockItem, String> description;
    public static volatile SingularAttribute<StockItem, Long> id;
    public static volatile SingularAttribute<StockItem, Date> creationDate;
    public static volatile SingularAttribute<StockItem, Double> retailPrice;

}