/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.util.Vector;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author J2EE-33
 */
//question 32
 class MyVector extends Vector {
int i = 1;
public MyVector() {
 i = 2;
 }
}

 public class MyNewVector extends MyVector {
 public MyNewVector() {
 i = 4;
 }
 public static void main(String args[]) {
 MyVector v = new MyNewVector();
 }
 }

