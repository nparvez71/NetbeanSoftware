package com.google.other;

import javax.print.DocFlavor;

/**
 *
 * @author J2EE-33
 */
public class Dog {
    private String name;
private String color;

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
