
package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.OrderLevel;
import com.r217887l.rawmaterialmanagement.Repo.OrderLevelRepository;


public class OrderLevelService {
    
    OrderLevelRepository olr = new OrderLevelRepository();
    
    public void saveOrderLevelRepo(OrderLevel orderlevel){
    
        olr.saveOrderLevel(orderlevel);
    }
    
}
