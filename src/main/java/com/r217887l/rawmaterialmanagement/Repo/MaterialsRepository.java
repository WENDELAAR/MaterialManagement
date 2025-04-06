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
            
            st.setString(1, material.getName());
            st.setString(2, material.getDec());
            st.setString(3, material.getSku());
            st.setString(4, material.getCategory());
            st.setString(5, material.getSupplier());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMaterial(Materials materials) {
       
    }

    public void deleteMaterial(Materials materials) {
        
    }

    
}
