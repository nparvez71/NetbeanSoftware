/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.Dao;

import com.parve.util.HibernateUtil;
import com.parvez.pojo.Student;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author masum
 */
public class StudentDao {
    
    public List <Student> allStudent(){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Student> list=session.createCriteria(Student.class).list();
        session.getTransaction().commit();
        session.close();
        return list;
}
    public void add(Student student){
    
     Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
     session.save(student);
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Student student){
    
     Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
     session.update(student);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Student student){
    
     Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
     session.delete(student);
        session.getTransaction().commit();
        session.close();
    }
}
