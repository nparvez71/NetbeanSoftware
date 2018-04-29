package com.google;

public class App {

    public static void main(String[] args) {
        Dog dog2 = new Dog();
        dog2.setName("tiger");
        dog2.setId(500);
        dog2.setPrice(1200.0);
        dog2.setColor("red");
        System.out.println("Name = " + dog2.getName());
        System.out.println("id = " + dog2.getId());
        System.out.println("price = " + dog2.getPrice());
        System.out.println("color = " + dog2.getColor());
    }

}
