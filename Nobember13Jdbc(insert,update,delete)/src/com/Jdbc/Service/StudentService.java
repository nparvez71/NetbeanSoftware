package com.Jdbc.Service;

import com.Jdbc.DAO.StudentDAO;
import com.Jdbc.Domain.Student;
import com.Jdbc.connection.OracleDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService implements StudentDAO {

    Connection conn = OracleDbConnection.getConnection("xe", "hr", "hr");

    @Override
    public void save(Student s) {
        try {
           // there is no entry if no value is here(4if conditon)
           
           if (s.getStudentName() != null) {

                PreparedStatement stms = conn.prepareStatement("insert into studentbd(id,student_name)values(?,?)");
                stms.setInt(1, s.getId());
                stms.setString(2, s.getStudentName());
                int i = stms.executeUpdate();
                System.out.println(i + "record updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student s) {
        try {
            if (s.getId() != 0) {

                PreparedStatement stms = conn.prepareStatement("update studentbd set student_name=?where id=?");
                stms.setString(1, s.getStudentName());
                stms.setInt(2, s.getId());

                int i = stms.executeUpdate();
                System.out.println(i + "record updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int id) {
        try {
            if (id != 0) {

                PreparedStatement stms = conn.prepareStatement("delete from studentbd where id=?");

                stms.setInt(1, id);

                int i = stms.executeUpdate();
                System.out.println(i + "record deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Student> getStudents() {

        List<Student> list = new ArrayList<>();

        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("select *from studentbd");
           
            
            ResultSet rs = stmt.executeQuery();//Data retrive purpassusing executeQuery()
            
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setStudentName(rs.getString(2));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    @Override
    public Student getStudent(int id) {
        Student s=null;
        
        try {
            PreparedStatement stmt=conn.prepareStatement("select *from studentbd where id=?");
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
             while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setStudentName(rs.getString(2));
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return s;
         }
}


