
package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SupplierDetailsRepository {
    
    public void saveSupplier(Supplier supplier){
        
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO supplierdetails "
                            + "(name,contactPerson,email,Phone,Address,dateCreated) "
                            + "VALUES(?,?,?,?,?,?)");
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
