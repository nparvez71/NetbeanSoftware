/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Teacher;
import com.service.TeacherService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author J2EE-33
 */
@ViewScoped
@ManagedBean
public class TeacherController {
    private TeacherService teacherservice; 
    private Teacher teacher;
    public void save(){
    
        try {
            teacherservice =new TeacherService();
            teacherservice.persist(teacher);
            System.out.println(" donee ");
        } catch (Exception e) {
        }
    }
       public void update(){
    
        try {
            teacherservice =new TeacherService();
            teacherservice.merge(teacher);
            System.out.println(" donee ");
        } catch (Exception e) {
        }
    }
          public void delete(){
    
        try {
            teacherservice =new TeacherService();
            teacherservice.remove(teacher);
            System.out.println(" donee ");
        } catch (Exception e) {
        }
    }
          

    public TeacherService getTeacherservice() {
        return teacherservice;
    }

    public void setTeacherservice(TeacherService teacherservice) {
        this.teacherservice = teacherservice;
    }

    public Teacher getTeacher() {
        if(teacher == null){
        teacher =new Teacher();
        }
        
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
}
