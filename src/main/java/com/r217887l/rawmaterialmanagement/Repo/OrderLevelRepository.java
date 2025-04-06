package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.OrderLevel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderLevelRepository {
    
    public void saveOrderLevel(OrderLevel orderLevel){
         
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO orderlevel "
                            + "(material,reOrder,stopOrder,dateCreated) "
                            + "VALUES(?,?,?,Now()");
            
            st.setString(1, orderLevel.getMaterial());
            st.setString(2, orderLevel.getReorder());
            st.setString(3, orderLevel.getStoporder());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateOrderLevel(OrderLevel orderLevel) {
   
    }
    
}
