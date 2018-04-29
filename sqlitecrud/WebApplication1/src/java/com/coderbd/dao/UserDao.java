/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.entity.User;
import com.coderbd.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author J2EE-33
 */
public class UserDao {
      public void add(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.save(user);
        
        session.getTransaction().commit();
        session.close();
    }
    
}
