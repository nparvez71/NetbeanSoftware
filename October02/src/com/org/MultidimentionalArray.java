package com.org;

public class MultidimentionalArray {

    public static void main(String[] args) {
        int[][] array2D = new int[2][3];
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;

        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 6;

        for (int[] array1D : array2D) {
            for (int item : array1D) {
                System.out.print("" + item);
            }
System.out.println("  " );
        }

    }
}
