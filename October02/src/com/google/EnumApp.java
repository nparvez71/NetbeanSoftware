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
public class EnumApp {
    public static void main(String[] args) {
        Person per=new Person("parvez", 25, Gender.MALE);
        
        System.out.println("name:"+per.getName()+"\n"
                +"age:"+per.getAge()+"\n"+"Gender"+per.getGender());
    }
}
