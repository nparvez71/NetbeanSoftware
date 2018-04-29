/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org;

/**
 *
 * @author J2EE-33
 */
public class Anotherinnerclass {
    private int data =30;
    void display(){
    class Local{
    void msg(){
        System.out.println(data);
    }
    }
    Local l=new Local();
    l.msg();
    }
    public static void main(String[] args) {
        Anotherinnerclass obj =new Anotherinnerclass();
        obj.display();
        
    }
}
