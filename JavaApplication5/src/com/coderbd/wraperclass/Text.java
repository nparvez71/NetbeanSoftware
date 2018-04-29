/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.wraperclass;

/**
 *
 * @author J2EE-33
 */
public class Text {
    private String docName;
    public static void main(String[] args) {
        
        int pInt=420;
        Integer wInt= new Integer( pInt);
        int p2=wInt.intValue();
        
        
        System.out.println("pInt:-"+ pInt);
        System.out.println("wInt:-"+ wInt);
        System.out.println("p2:-"+ p2);
        
    }
    
}
