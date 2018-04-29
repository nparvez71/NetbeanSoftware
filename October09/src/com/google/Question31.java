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
public class Question31 {
   
 public static void main( String[] args ) {
 boolean flag; int i=0;
 do {
 flag = false;
 System.out.print( i++ );
 flag = i < 10;
 continue;
 } while ( (flag)? true:false );
}
 }

