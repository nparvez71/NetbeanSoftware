/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.entity.Department;
import com.service.DepartmentService;

/**
 *
 * @author J2EE-33
 */
public class DepartmentInsert {
    static DepartmentService departservice=new DepartmentService();
    public static void main(String[] args) {
        try {
            Department d=new Department();
            d.setDeptname("Java");
           departservice.persist(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
         System.out.println("Success");
    }
    
}
