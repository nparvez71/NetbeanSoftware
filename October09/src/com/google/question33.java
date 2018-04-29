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
//question33 
    
    class Super {
 public Integer getLenght() { return new Integer(4); }
 }

 public class Sub extends Super {
 public Long GetLenght() { return new Long(5); }

 public static void main(String[] args) {
 Super sooper = new Super();
 Sub sub = new Sub();
 System.out.println(
 sooper.getLenght().toString() + “,” +
sub.getLenght().toString() );
}
}

