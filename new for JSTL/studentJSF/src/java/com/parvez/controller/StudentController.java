/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.controller;

import com.parvezdomain.studentSearch;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author J2EE-33
 */
@SessionScoped
@ManagedBean(name = "studentController")
public class StudentController {
    private studentSearch student;

    public studentSearch getStudent() {
        if(student== null){
        student =new studentSearch();}
        return student;
    }

    public void setStudent(studentSearch student) {
        this.student = student;
    }
    
    
}
