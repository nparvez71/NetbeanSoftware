/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package october15;

import java.util.Arrays;

/**
 *
 * @author J2EE-33
 */
public class arrayShorting {
    public static void main(String[] args) {
        
        int[][] data={{10,50,15,30},{15,02,20,14},{25,12,10}};
        System.out.println("Numbers");
        for(int[] d:data){
            Arrays.sort(d);//print the line row formate//
        for(int a:d)//int a is here integer type//
        {System.out.println(a+" ");}
            System.out.println("");
        }
    }
}
