/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package october22;

import java.util.Arrays;

/**
 *
 * @author J2EE-33
 */
public class arraygain {
    public static void main(String[] args) {
        int [][] data={{10,11,12},{14,15,16}};
        System.out.println("");
        for (int [] d:data){Arrays.sort(d);
        for(int a:d){System.out.print(a+"");}
            System.out.println("");
        
        }
    }
}
