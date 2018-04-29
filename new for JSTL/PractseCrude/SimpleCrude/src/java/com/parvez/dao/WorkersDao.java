/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.dao;

import com.parvez.entity.Workers;
import com.parvez.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author J2EE-33
 */
public class WorkersDao {

    public List<Workers> allWorkers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Workers> list = session.createCriteria(Workers.class).list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    public void add(Workers workers) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(workers);
        session.getTransaction().commit();
        session.close();

    }
    
  public void update(Workers workers) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(workers);
        session.getTransaction().commit();
        session.close();

    }
    public void delete(Workers workers) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(workers);
        session.getTransaction().commit();
        session.close();

    }
}
