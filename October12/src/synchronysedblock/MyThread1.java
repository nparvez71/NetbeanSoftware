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

    public class MyThread1 extends Thread{

    Datas t;

    MyThread1(Datas t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
    

