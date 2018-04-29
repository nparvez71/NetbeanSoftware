/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Jdbc.Service;

import com.Jdbc.Domain.Student;
import java.util.List;





public class TestSave {
   static StudentService studentservice;
    public static void main(String[] args) {
        studentservice=new StudentService();
        Student std=new Student(1004,"Fahmida");
        studentservice.save(std);
         //studentservice.update(std);
         //  studentservice.delete(1002);
//         List<Student> list =studentservice.getStudents();
//         for(Student s:list){
//             System.out.println("Id:"+s.getId()+"Name: "+s.getStudentName());
//            
//         }
//       Student student=studentservice.getStudent(1002);
//        System.out.println("Id:"+student.getId()+"Name: "+student.getStudentName());
  }
//    
    
}
