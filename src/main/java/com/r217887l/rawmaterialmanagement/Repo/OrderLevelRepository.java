package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.OrderLevel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
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

    public void updateOrderLevel(OrderLevel orderLevel,int id) {
        
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("UPDATE orderlevel "
                            + "SET materialId = ?, "
                            + "reOrder = ?, "
                            + "stopOrder =?, "
                            + "WHERE id = ? ");
            
            st.setString(1, orderLevel.getMaterial());
            st.setString(2, orderLevel.getReorder());
            st.setString(3, orderLevel.getStoporder());
            st.setInt(4, id);
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteOrderLevel(int id) {
        
            
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("DELETE FROM orderlevel WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    }

    public List<OrderLevel> findAllOrderLevel(OrderLevel orderLevel) {
  
        return null;
  
    }
    
}
