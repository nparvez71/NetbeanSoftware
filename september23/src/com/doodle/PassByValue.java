/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doodle;

/**
 *
 * @author J2EE-33
 */
public class PassByValue {
    public static void changeInt(int value) {
        value=55;
        System.out.println(value);
    }
    public static int changeIntx(int value) {
        return value;
    }
    
    public static void main(String[] args) {
        
        int val;
        val=11;
        changeInt(val);
        int a=changeIntx(val);
        System.out.println("int val of is:"+a);
        System.out.println("int val is:"+val);
    }
}
