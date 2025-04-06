
package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.OrderLevel;
import com.r217887l.rawmaterialmanagement.Repo.OrderLevelRepository;
import java.util.List;


public class OrderLevelService {
    
    OrderLevelRepository olr = new OrderLevelRepository();
    
    public void saveOrderLevelRepo(OrderLevel orderlevel){
    
        olr.saveOrderLevel(orderlevel);
    }
    
    public void updateOrderLevel(OrderLevel orderLevel){
     olr.updateOrderLevel(orderLevel);
    }
    
    public void deleteOrderLevel(int id){
     olr.deleteOrderLevel(id);
    }
   
    public List<OrderLevel> findAllOrderLevel(OrderLevel orderLevel){
     return olr.findAllOrderLevel(orderLevel);
    }
   
    
}
