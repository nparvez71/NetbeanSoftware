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
public class Page132 {

    public static char[] createArray() {
        char[] s;
        s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char) ('A' + i);

        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(createArray());
    }
}


