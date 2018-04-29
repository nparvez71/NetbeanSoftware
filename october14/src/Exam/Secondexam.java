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
public class Secondexam {
   String grade="";
    public static void main(String[] args) {
       
       
        Scanner sc = new Scanner(System.in);
         System.out.println("Write your mcq number:");
        int mcq = sc.nextInt();
       
        System.out.println("Write your evidence number:");
        int evidence = sc.nextInt();
        int total = mcq + evidence;
      
        if (mcq >= 70 && evidence >= 30) {
            if (mcq >= 100 || evidence >= 50) {
                System.out.println("you cnnot wrie over100 or 50");
            } else {
                
                 
                System.out.println("pass"+total);
            }
        } else {if(total>=140&& total>=150){grade="a+";}
        else if(total>=130&& total>=139){grade="a";}
           else if(total>=120&& total>=129){grade="b+";}
        else if(total>=110&& total>=119){grade="b";}
        else if(total>=100&& total>=109){grade="c";}
        else{grade="f";}
            System.out.println("fail");
        }
    }
}
