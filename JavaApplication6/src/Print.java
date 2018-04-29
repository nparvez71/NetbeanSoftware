/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */
public class Print {

    public static void main(String[] args) {
        Dog dog1 = new Dog("jerry", 10, 5000.0);
        System.out.println("name:-" + dog1.getName());
        System.out.println("number:-" + dog1.getNumber());
        System.out.println("price:-" + dog1.getPrice());
    }

}
