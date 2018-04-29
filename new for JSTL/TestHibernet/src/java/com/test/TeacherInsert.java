/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.entity.Department;
import com.entity.Teacher;
import com.service.TeacherService;

/**
 *
 * @author J2EE-33
 */
public class TeacherInsert {
   static TeacherService teacherservice =new TeacherService();
    public static void main(String[] args) {
        try {
            Teacher t =new Teacher();
            t.setTeachername("Parvez");
            t.setEmail("nparvez92ccc@gmail.com");
            t.setAge(25);
            Department department=new Department();
            department.setId(1);
            t.setDepartment(department);
            teacherservice.persist(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
     
        System.out.println("Success");
    }
    
}
