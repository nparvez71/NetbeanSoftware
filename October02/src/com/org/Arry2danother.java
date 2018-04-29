
package com.org;

public class Arry2danother {
    public static void main(String[] args) {
        
        int[][] array2D = {{1,2,9},{4,5,6,0,5},{1,2,9}};
       

        for (int[] array1D : array2D) {
            for (int item : array1D) {
                System.out.print("" + item);
            }
System.out.println("  " );
        }
    }
    
}
