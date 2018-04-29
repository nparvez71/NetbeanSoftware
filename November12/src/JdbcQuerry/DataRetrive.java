/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcQuerry;

import JdbcDomain.Employees;
import JdbcProject.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class DataRetrive {

    static Connection conn = DbConnection.getConnection("xe", "hr", "hr");

    public static List<Employees> getEmployee() {
        List<Employees> list = new ArrayList<>();

        try {
            Employees employee;
            PreparedStatement stmt = conn.prepareStatement("select * from employees");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                employee = new Employees();

                employee.setEmployyeeId(rs.getInt(1));
                employee.setLastName(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
         return list;
        

    }
        
}
