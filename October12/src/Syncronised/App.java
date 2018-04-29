/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syncronised;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Synchronisedex1 obj=new Synchronisedex1();
        
        MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj); 
t1.start();  
t2.start(); 
    }
}
