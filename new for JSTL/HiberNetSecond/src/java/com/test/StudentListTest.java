/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.entity.Student;
import com.service.StudentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class StudentListTest {
    public static void main(String[] args) {
         StudentService studentservice =new StudentService();
        List<Student> studentList=new ArrayList();
      
        try {
            studentList = studentservice.findAll();
              System.out.println("size: "+studentList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
