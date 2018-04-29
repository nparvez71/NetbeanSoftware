/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.controller;

import com.coderbd.dao.UserDao;
import com.coderbd.entity.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author J2EE-33
 */
@ManagedBean
@SessionScoped
public class UserBean {
    public User user=new User();
    public UserDao userDao= new UserDao();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public String addUser(){
        userDao.add(user);
        return"index.xhtml?faces-redirect=true";
    
    
    }
    
    
}
