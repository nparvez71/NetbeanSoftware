/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import static com.java.WhileSum.makeSum;

/**
 *
 * @author J2EE-33
 */
public class DoWhileSum {

    private static int s = 1;
    private static int e = 10;
    private static int result = 0;

    public static void main(String[] args) {
        System.out.println(makeSum(s, e));
    }

    public static int makeSum(int x, int y) {
        do {
            result += x;
            x++;
        } while (x <= y);
        return result;
    }

}
