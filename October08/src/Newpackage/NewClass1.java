/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newpackage;

/**
 *
 * @author J2EE-33
 */
public class NewClass1 {
    public static void main(String[] args) {
        int i =1,j =10;
 do {
 if(i++ < --j) {
 continue;
 }
} while (i <5);
 System.out.println("i = "+i+ " and j = "+j);
    }
    
}
