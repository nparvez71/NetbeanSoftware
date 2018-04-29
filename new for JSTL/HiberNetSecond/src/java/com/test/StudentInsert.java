/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.entity.Student;
import com.service.StudentService;

/**
 *
 * @author J2EE-33
 */
public class StudentInsert {
    public static void main(String[] args) {
        StudentService studentservice =new StudentService();
        try {
            Student st=new Student();
            st.setStudentName("Fahim");
            st.setEmail("fahimx@yahoo.com");
            studentservice.persist(st);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("data innn");
        
        
    }
    
}
