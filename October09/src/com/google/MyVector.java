/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.util.Vector;

/**
 *
 * @author J2EE-33
 */


  class MyVector extends Vector { //question24
int i = 1;
public MyVector() {
 i = 2;
 }
 }

 public class MyVector extends MyVector {
 public MyVector() {
 i = 4;
 }
 public static void main(String args[]) {
 MyVector v = new MyVector();
     System.out.println(""+args);
 }
 }

