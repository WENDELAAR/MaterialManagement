
package com.r217887l.rawmaterialmanagement.Repo;

import DAO.DAOCONNECT;
import com.r217887l.rawmaterialmanagement.Model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
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

    public void updateUser(Users users, int id) {
        
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("UPDATE Users "
                            + "SET firstName = ?, "
                            + "lastName = ?, "
                            + "userName = ?, "
                            + "roles = ?, "
                            + "pass = ? "
                            + "WHERE id = ?");
            st.setString(1, users.getFirstName());
            st.setString(2, users.getLastName());
            st.setString(3, users.getUserName());
            st.setString(4, users.getRoles());
            st.setString(5, users.getPassword());
            st.setInt(6, id);
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteUser(int id) {
        
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("DELETE FROM users WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }

    public List<Users> findAllUsers(Users users) {
    
        return null;
   
    }

    public boolean chechIfUserTableEmpty() {
   
        Connection dbconn = DAOCONNECT.connectdb();
        
        try {
            Statement st = dbconn.createStatement();
            ResultSet res = st.executeQuery("SELECT COUNT(*) FROM users");
               while(res.next()){
            
                int count = res.getInt(1);
                
                if (count==0){
                    System.out.println("table is empry");
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
   
    }

}
