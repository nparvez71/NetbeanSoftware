/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threademultiple;
   



/**
 *
 * @author J2EE-33
 */
public class App {
    
    public static void main(String[] args) {
        Uncle uncle=new Uncle();
        Thread uncleThread =new Thread(uncle);
        uncleThread.setName("mr.jhon");
        uncleThread.setPriority(10);
        uncleThread.start();
        
        
        Urmi urmi =new Urmi();
          Thread urmiThread =new Thread(urmi);
          urmiThread.setName("big apu");
          urmiThread.setPriority(1);
          urmiThread.start();
          
          System.out.println("uncleThread"+uncleThread.getName());
          System.out.println("urmiThread"+urmiThread.getName());
    }
    
}
