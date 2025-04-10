package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOCONNECT {
    
      static final String URL = "jdbc:mysql://localhost:3306/panashe";
    static final String User = "root";
    static final String Pass = "Elvis.blaba02";
    
    public static Connection connectdb(){
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOCONNECT.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            conn = DriverManager.getConnection(URL,User,Pass);
        } catch (SQLException ex) {
            Logger.getLogger(DAOCONNECT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
  
}
