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
class WhileSum {

    private static int s = 1;
    private static int e = 10;
    private static int result = 0;

    public static void main(String[] args) {
        System.out.println(makeSum(s,e));
    }

    public static int makeSum(int x, int y) {
        while (x <= y) {
            result+= x;
            x++;
        }
        return result;
    }
}
