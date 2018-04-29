/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnotherTread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class anotherpage312 extends Thread {
 int i = 0;
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(anotherpage312.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread staring running");
        while (true) {
           
            System.out.println("result of i:" + i++);
            if (i == 10) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new anotherpage312();
        t.start();
    }

}
