/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class Test {
    public static void main(String[] args) {
        List<Person> p=new ArrayList();
        p.add(new Person("jamal"));
          p.add(new Person("kamal"));
          for (Person p1:p){
            System.out.println("name:::"+p1.getName());
          }
        
        
//         Person p=new Person("parvez");
//         System.out.println("name:::"+p.getName());
    }
   
    
    
}
