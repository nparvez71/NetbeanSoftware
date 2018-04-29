/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronysedblock;

/**
 *
 * @author J2EE-33
 */

 
public class MyThread2 extends Thread{

    Datas t;

    MyThread2(Datas t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
    

