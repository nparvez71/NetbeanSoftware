/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.controller;

import com.parvez.Dao.StudentDao;
import com.parvez.pojo.Student;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author masum
 */
@ManagedBean
@SessionScoped
public class StudentBean {
    Student student=new Student();
    StudentDao studentDao =new  StudentDao();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    public void Change(Student student){
        this.student=student;
    
    }
    public List<Student> getAllStudent(){
        
        return studentDao.allStudent();
}
    public void addStudent(){
    studentDao.add(student);
    }
      public void update(Student student){
    studentDao.update( student);
    }
      public void delete(Student student){
    studentDao.delete( student);
    }
}
