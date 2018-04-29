
package com.Jdbc.createTable;

import com.Jdbc.connection.OracleDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCtreateTable {
    
    static Connection conn=OracleDbConnection.getConnection("xe", "hr", "hr");
    public static void main(String[] args) {
        String sql="CREATE TABLE studentbd"+"(id INTEGER not NULL,"+"student_name VARCHAR(255),"+"PRIMARY KEY(id))";
        
        try {
            PreparedStatement pstm=conn.prepareStatement(sql);
            int i=pstm.executeUpdate();
            System.out.println(i+"table created");
        } catch (SQLException ex) {
            Logger.getLogger(TestCtreateTable.class.getName()).log(Level.SEVERE,null,ex);
        }
        
         
    }
}
