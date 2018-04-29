/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september26;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal tommy = new Tommy();
         System.out.println("ur my dear tommy");
           System.out.println("ur my dear tommy");
             System.out.println("ur my dear tommy");
        
        Dog dog2=new Dog();
        doSomething(dog);
        Dog tommy2=new Dog();
        
     Tommy tommy3=new Tommy();
     
     Animal a1=animal;
     Animal a2=dog;
     Animal a3=tommy;
     
     Dog d1=tommy3;
     Dog d2=(Dog) animal; // casting animal as Dog class//
     Dog d3=tommy2;
     
     Tommy m1=(Tommy)animal; // casting animal as tommy class//

    }

    public static void doSomething(Animal e) {

        if (e instanceof Dog) {
            System.out.println("Dog");
        } else if (e instanceof Tommy) {
            System.out.println("Tommy");
        } else {
            System.out.println("Animal");
        }
    }

}
