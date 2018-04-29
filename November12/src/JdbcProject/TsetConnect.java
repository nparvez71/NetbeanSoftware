/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcProject;

import java.sql.Connection;

/**
 *
 * @author J2EE-33
 */
public class TsetConnect {
    public static void main(String[] args) {
         Connection conn=DbConnection.getConnection("xe", "hr", "hr");
        
    }
}
