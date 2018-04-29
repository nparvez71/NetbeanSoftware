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
public class MyThread2 extends Thread{
    Synchronisedex1 t;

    public MyThread2(Synchronisedex1 t) {
        this.t = t;
    }
    
    public void run(){
    t.printTable(100);
    }
            
}
