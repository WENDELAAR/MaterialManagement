package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.categories;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriesRepository {

   public void saveCategory(categories category){
    Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO categories "
                            + "(name) "
                            + "VALUES(?)");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
   
}
