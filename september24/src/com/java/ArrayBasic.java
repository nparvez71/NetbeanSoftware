/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

/**
 *
 * @author J2EE-33
 */
public class ArrayBasic {

    private int[] x = {10, 12, 15, 20};
    private static int y[];

    public static void main(String[] args) {
        y = new int[2];
        y[0] = 5;
         y[1] = 4;
         System.out.println(y.length);
         for(int i:y){
             System.out.println(i);
         }
    }
}
