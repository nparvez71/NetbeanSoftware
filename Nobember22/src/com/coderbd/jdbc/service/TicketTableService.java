package com.coderbd.jdbc.service;

import com.coderbd.jdbc.connections.OracleDBConnection;



import Dao.Ticketdao;
import com.parvez.TicketTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketTableService implements Ticketdao {

    Connection conn = OracleDBConnection.getConnection("xe", "hr", "hr");

    public void save(TicketTable tb) {
        try {
            if (tb.getTicketcode()!= null) {
                PreparedStatement stmt = conn.prepareStatement("insert into TicketTable(Ticketcode,student_name ) values(?,?)");
                stmt.setInt(1, tb.getTicketcode());
                stmt.setString(2, tb.getFrom());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TicketTable.class.getTicketcode()).log(Level.SEVERE, null, ex);
        }
    }

//    public void update(TicketTable tb) {
//        try {
//            if (tb.getTicketcode()!= 0) {
//                PreparedStatement stmt = conn.prepareStatement
//        ("update studentbd set student_name=? where id=?");
//
//                stmt.setString(1, s.getStudentName());
//                stmt.setInt(2, s.getId());
//                int i = stmt.executeUpdate();
//                System.out.println(i + " record Updated");
//            }
//            // con.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void delete(int id) {
//        try {
//            if (id != 0) {
//                PreparedStatement stmt = conn.prepareStatement(
//                        "delete from studentbd where id=?");
//
//                stmt.setInt(1, id);
//
//                int i = stmt.executeUpdate();
//                System.out.println(i + " record Deleted");
//            }
//            // conn.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public List<Student> getStudents() {
//          List<Student> list = new ArrayList<>();
//        try {
//            Student s;
//            PreparedStatement stmt = conn.prepareStatement("select *from studentbd");
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                s = new Student();
//                s.setId(rs.getInt(1));
//                s.setStudentName(rs.getString(2));             
//                list.add(s);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataRetrieveService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//
//    @Override
//    public Student getStudent(int id) {
//         Student s=null;
//        try {
//           
//            PreparedStatement stmt = conn.prepareStatement(
//                    "select * from studentbd where id=?");
//             stmt.setInt(1, id);
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                s = new Student();
//                s.setId(rs.getInt(1));
//                s.setStudentName(rs.getString(2));             
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataRetrieveService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return s;
//    }
//
//    @Override
//    public void save() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void save(TicketTable tb) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void update(TicketTable tb) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<TicketTable> getTicketTables() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
