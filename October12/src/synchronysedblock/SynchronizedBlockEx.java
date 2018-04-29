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

    public class SynchronizedBlockEx {

    public static void main(String args[]) {
        Datas obj = new Datas();//only one object  
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
    

