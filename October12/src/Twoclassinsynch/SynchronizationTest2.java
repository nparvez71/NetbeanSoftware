/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twoclassinsynch;

/**
 *
 * @author J2EE-33
 */

    public class SynchronizationTest2 {

    public static void main(String args[]) {
        final Datas obj = new Datas();//only one object  

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
    

