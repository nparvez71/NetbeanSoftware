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
public class ArrayFoundLarge {

    private static int nums[] = {4, 2, 45, 7, 46};
    private static int bignumber = 0;

    public static void main(String[] args) {
        for (int x : nums) {
            if (x > bignumber) {
                bignumber = x;
            }

        }
         System.out.println (bignumber);
    }

   
}
