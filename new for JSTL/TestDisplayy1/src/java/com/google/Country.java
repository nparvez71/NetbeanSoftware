/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

/**
 *
 * @author J2EE-33
 */
public class Country {
    private int id;
    
    private String name;
  private String BirthDate;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", name=" + name + '}';
    }
    
    public void display(){
    
        System.out.println("id:"+id);
         System.out.println("name:"+name);
           System.out.println("name:"+BirthDate);
    }
}
