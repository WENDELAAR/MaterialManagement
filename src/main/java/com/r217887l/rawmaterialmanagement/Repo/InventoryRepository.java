package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.Inventory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InventoryRepository {

public void saveInventory(Inventory inventory){
 Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO inventory "
                            + "(stockDate,materialId,stockIn,stockOut,price,dateCreated) "
                            + "VALUES(?,?,?,?,?,NOW()");
            
            st.setDate(1,inventory.getStokedate());
            st.setString(2, inventory.getMaterial());
            st.setInt(3, inventory.getStockin());
            st.setInt(4, inventory.getStockout());
            st.setDouble(5, inventory.getPrice());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public void updateInventory(Inventory inv) {
        
    }

    public void deleteInventory(Inventory inv) {
        
    }
  
}
