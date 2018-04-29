/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.page249;

import java.util.Properties;

/**
 *
 * @author J2EE-33
 */
public class TestProperties {
    public static void main(String[] args) {
        Properties prop=System.getProperties();
       prop.list(System.out);
       
       String pro=System.getProperty("parvez","idb");
        System.out.println(""+pro);
    }
}
