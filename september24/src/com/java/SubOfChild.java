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
public class SubOfChild  extends SuperOrParent{
    public static void main(String[] args) {
        SuperOrParent object=new SubOfChild ();
        System.out.println(object.name);
    }
}
