/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goole;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        OverloadigMethod obj=new OverloadigMethod();
        System.out.println("x1:="+obj.average(10));
        System.out.println("x1:="+obj.average(10, 20));
        System.out.println("x1:="+obj.average(10, 20, 30));
        float avg=obj.average(1,2,3,4,5);
        System.out.println(avg);
    }
    
}
