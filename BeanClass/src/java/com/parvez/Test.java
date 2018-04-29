/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class Test {

    List<Person> list = new ArrayList<>();

    public Test() {
        list.add(new Person("Jaman"));
        list.add(new Person("milon"));
        list.add(new Person("himel"));
        list.add(new Person("shojon"));
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

   

}
