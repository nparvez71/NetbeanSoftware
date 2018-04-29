/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.wraperclass;

/**
 *
 * @author J2EE-33
 */
public class NewClass {
    public static void main(String[] args) {
        String a ="10";
        int x= Integer.parseInt(a);
        System.out.println("x->"+x);
        int y=Integer.valueOf(a).intValue();
              System.out.println("y>-"+y);
    }
 
    
}
 