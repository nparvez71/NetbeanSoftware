/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org;

/**
 *
 * @author J2EE-33
 */
public class Outter {
    public int x=5;
    
    class Inner{
        public int x=10;
        void methodinInnerclass(int x){
            System.out.println("x="+x);
              System.out.println("inner.x"+this.x);
                System.out.println("outter.this"+Outter.this.x);
        }
    
    }
    public static void main(String[] args) {
        Outter out=new Outter();
        Outter.Inner inner=out.new Inner();
        inner.methodinInnerclass(23);
    }
    
}
