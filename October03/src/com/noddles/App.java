package com.noddles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Father father=new Father();
        Child son =new Child();
        father.setName("amin mia");
        son.setAge(25);
        son.setIncome(10000);
        System.out.println("f  name is "+father.getName()+"his assect"+father.property(50000));
        
        System.out.println("son age"+son.getAge()+"house cost"+son.house(20000)+" s income"+son.getIncome()+"s asset"+son.income(0)
               );
    }
    
}
