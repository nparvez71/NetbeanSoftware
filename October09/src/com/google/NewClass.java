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
//question no--5

    interface Animal {
 void soundOff();
 }

 class Elephant implements Animal {
 public void soundOff() {
System.out.println("Trumpet");
 }
 }

 class Lion implements Animal {
 public void soundOff() {
 System.out.println("Roar");
 }
 }

class Alpha1 {
static Animal get( String choice ) {
if ( choice.equalsIgnoreCase( "meat eater" )) {
 return new Lion();
 } else {
 return new Elephant();
 }
}
 }

