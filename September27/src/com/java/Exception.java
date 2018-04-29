package com.java;

public class Exception {

    public static void main(String[] args) {
        try {
            try {
                args = new String[2];
                args[0] = "10";
                args[1] = "10";
                System.out.println("index:" + args[0]);
                System.out.println("index:" + args[1]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("++++ArrayIndexOutOfBoundsException+++");
            }
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("Finalyy it must print");
        }

    }

}
