package october15;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author J2EE-33
 */
public class AnotherArraySorting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] n = new int[3][3];
        System.out.println("Enter number");
        n[0][0] = s.nextInt();
        System.out.println("Enter number");
        n[0][1] = s.nextInt();
        System.out.println("Enter number");
        n[0][2] = s.nextInt();

        System.out.println("Enter number");
        n[1][0] = s.nextInt();
        System.out.println("Enter number");
        n[1][1] = s.nextInt();
        System.out.println("Enter number");
        n[1][2] = s.nextInt();

        System.out.println("Enter number");
        n[2][0] = s.nextInt();
        System.out.println("Enter number");
        n[2][1] = s.nextInt();
        System.out.println("Enter number");
        n[2][2] = s.nextInt();

        sorting(n);

    }

    public static void sorting(int[][] n) {
        for (int[] d : n) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.print(a + "");
            }
            System.out.println("");
        }
    }
}
