
package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.SupplierDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SupplierDetailsRepository {
    
    public void saveSupplier(SupplierDetails supplier){
        
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO supplierdetails "
                            + "(name,contactPerson,email,Phone,Address,dateCreated) "
                            + "VALUES(?,?,?,?,?,?)");
           st.setString(1, supplier.getName());
           st.setString(2, supplier.getContactPerson());
           st.setString(3, supplier.getEmail());
           st.setString(4, supplier.getPhone());
           st.setString(5, supplier.getAddress());
           st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSupplier(SupplierDetails supplier, int id) {
        
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("UPDATE supplierdetails "
                            + "SET name = ?, "
                            + "contactPerson = ?,"
                            + "email = ?, "
                            + "Phone = ?, "
                            + "Address = ?,"
                            + "NOW() "
                            + "WHERE id = ?");
           st.setString(1, supplier.getName());
           st.setString(2, supplier.getContactPerson());
           st.setString(3, supplier.getEmail());
           st.setString(4, supplier.getPhone());
           st.setString(5, supplier.getAddress());
           st.setInt(6, id);
            
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDetailsRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void deleteSupplier(int id) {
  
            
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("DELETE FROM supplierdetails WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    public List<SupplierDetails> findAllSuppliers(SupplierDetails supplierDetails) {
 
        return null;
 
     }
    
}
