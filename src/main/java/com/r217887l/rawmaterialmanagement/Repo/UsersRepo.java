
package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsersRepo {
    
    public void saveUser(Users users){
    
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO Users "
                            + "(firstName,lastName,userName,roles,pass) "
                            + "VALUES(?,?,?,?,?)");
            st.setString(1, users.getFirstName());
            st.setString(2, users.getLastName());
            st.setString(3, users.getUserName());
            st.setString(4, users.getRoles());
            st.setString(5, users.getPassword());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void updateUser(Users user) {
  
    }

    public void deleteUser(Users user) {
 
    }

}
