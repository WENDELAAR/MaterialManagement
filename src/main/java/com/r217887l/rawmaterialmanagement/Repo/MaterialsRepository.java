package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.Materials;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaterialsRepository {
    
    public void saveMaterials(Materials material){
         Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO materials"
                            + "(name,description,sku,categoryId,supplierId) "
                            + "VALUES(?,?,?,?,?)");
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
