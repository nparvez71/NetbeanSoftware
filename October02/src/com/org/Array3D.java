package com.org;

public class Array3D {

    public static void main(String[] args) {

        int[][][] array3D = {
            {{1, 2, 3}, {4, 5,6}, {7, 8, 9}},
            {{10 , 11 , 12}, {14 , 15 ,20}, {21, 22, 29}}
        };
for(int[][]array2D:array3D){
    for(int[]array1D:array2D){
    for(int item :array1D){
        System.out.print  (" "+item);
    }
        System.out.println ("   ");
    }
      System.out.println ("    ");
}
    }

}
