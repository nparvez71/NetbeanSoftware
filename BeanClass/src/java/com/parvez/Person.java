/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez;

/**
 *
 * @author J2EE-33
 */
public class Person {
    public String name;

    public Person() {
          setName("Name");
    }
    

    public Person(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
