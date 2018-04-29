package com.google;

import com.google.other.Dog;

/**
 *
 * @author J2EE-33
 */
public class TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog tommy = new Dog();
        tommy.setName("Tommy");
        tommy.setColor("Red");
        System.out.println("name:-" + tommy.getName() + ", color:-" + tommy.getColor());
Dog jerry=new Dog("jerry","black");
        System.out.println("name:-"+jerry.getName()+" ,color:-"+jerry.getColor());
    }

}
