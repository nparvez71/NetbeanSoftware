/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Student;
import com.service.StudentService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author J2EE-33
 */
@ManagedBean
public class StudentController {
     StudentService studentservice;
        List<Student> studentList;

    public StudentService getStudentservice() {
        return studentservice;
    }

    public void setStudentservice(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    public List<Student> getStudentList() {
        try {
            studentservice=new StudentService();
            studentList=studentservice.findAll();
        } catch (Exception e) {
        }
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
     public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Student Edited", ((Student) event.getObject()).getStudentName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Student) event.getObject()).getStudentName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
}
