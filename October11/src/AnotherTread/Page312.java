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
public class Page312 extends Thread{
    public void run(){
    while(true){
        System.out.println("Parvez");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            
        }
}
    }
    
    public static void main(String[] args) {
        Thread t=new Page312();
        t.start();
    }
}
