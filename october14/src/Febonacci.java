/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */

   

public class Febonacci {

    public static void main(String[] args) {
        int a, b, c;
        for (a = 0, b = 1, c = 0; c <= 100; a = b, b = c, c = a + b) {
            System.out.println(c);
        }
    }


}
