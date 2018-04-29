/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */
public class AnnonymousinterFace {
    
    public static void main(String[] args) {
        Animal  animal= new Animal() {
            @Override
            public void bit() {
                System.out.println("animal can bite");
              }

            @Override
            public void run() {
                System.out.println("animal can run");
               }
        };
        animal.bit();
        animal.run();
    }
}
