/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnotherTread;

/**
 *
 * @author J2EE-33
 */
public class NewClass {
    
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread();
        t.start();
        t.sleep(5000);
        t.setName("parvez");
        
         Thread t1=new Thread();
        t1.start();
      
        t1.setName("parvez1");
        
        System.out.println("Thread Name"+t1.getName());
         System.out.println("Thread Name"+t.getName());
    }
}
