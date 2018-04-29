package com.coderbd.jdbc.service;

import com.parvez.TicketTable;
import java.util.List;

public class Test {

    static TicketTableService TicketTableService;

    public static void main(String[] args) {
        TicketTableService = new TicketTableService();
      TicketTable std = new TicketTable(1007, "uttara");
        TicketTableService.save(std);

        //check for update
        // Student std = new Student(1003, "Ruhul Amin");
        //studentService.update(std);
//Check for delete
        // studentService.delete(101);
        //get list of student
       //List<Student> list = studentService.getStudents();
       // for (Student s : list) {
           // System.out.println("ID: " + s.getId() + " Name; " + s.getStudentName());
       // }
             
             
        // get single student according to id
       // Student student = studentService.getStudent(1003);
       // System.out.println("ID: " + student.getId() + " Name; " + student.getStudentName());
    }
}
