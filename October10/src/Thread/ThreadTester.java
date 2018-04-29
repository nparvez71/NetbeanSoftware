/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author J2EE-33
 */
public class ThreadTester {

    public static void main(String[] args) {
        ThreadTester obj = new ThreadTester();
        HelloRunner r=new HelloRunner();
        Thread t = new Thread(r);
        t.start();
         Thread t1 = new Thread(r);
//        t1.start();
//         Thread t2 = new Thread(r);
//        t2.start();
//        
     
    }
   
}
