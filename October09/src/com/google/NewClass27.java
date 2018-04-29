/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

/**
 *
 * @author J2EE-33
 */
public class NewClass27 {
    public static void main(String[] args) {
 System.out.println("value = " + switchIt(4));
 }
 public static int switchIt(int x) {
 int j = 1;
 switch (x) {
 case 1: j++;
 case 2: j++;
 case 3: j++;
 case 4: j++;
 case 5: j++;
 default: j++;
 }
 return j + x;
 }
 }
    

