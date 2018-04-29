/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.UserDao;
import com.entity.User;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author J2EE-33
 */
@ManagedBean
@SessionScoped
public class UserBean {

    public User user = new User();
    public UserDao userDao = new UserDao();

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

    public List<User> getAllUsers() {

        return userDao.allUsers();
    }

    public String addUser() {

        userDao.add(user);
        return "welcomePrimefaces.xhtml?faces-redirect=true";

    }

    public String update(User user) {

        userDao.update(user);
        return "welcomePrimefaces.xhtml?faces-redirect=true";

    }

    public String delete(User user) {

        userDao.delete(user);
        return "welcomePrimefaces.xhtml?faces-redirect=true";

    }

    public void changeUser(User user) {

        this.user = user;
    }

}
