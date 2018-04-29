/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class PassFail {
    public static void main(String[] args) {
        System.out.println("wtite here number");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=70){
            System.out.println("pass");
        }
        else{System.out.println("fail");
        }
    }
    
}
