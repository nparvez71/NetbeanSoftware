/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.Student;
import com.coderbd.util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author J2EE-33
 */
public class UserDao {

    public static int saveStudent(Student s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int i = (Integer) session.save(s);
        session.getTransaction().commit();
        session.close();
        return i;
    }

    public static int validStudent(Student std) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Student where name=:name and password=:password");
        q.setString("name", std.getName());
        q.setString("password", std.getPassword());
        List list = q.list();
        int i = list.size();
        session.getTransaction().commit();
        session.close();
        return i;
    }
}
