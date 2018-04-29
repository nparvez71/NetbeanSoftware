/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testyield;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {
        new TestThreadYield("Thread 1");
        new TestThreadYield("Thread 2");
        new TestThreadYield("Thread 3");

    }
}
