
package Exam;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n= s.nextInt();
        checkprime(n);
    }
     public static void checkprime(int n){
     int i,m=0,flag=0;
     m=n/2;
     if(n==0||n==1){
         System.out.println("number is not prime");
         flag=1;
     }else{
     for(i=2;i<=m;i++){
     if(n%i==0){
         System.out.println("number is not prime");
         flag=1;
         break;
     }  } }
     if(flag==0){
         System.out.println("number is prime");
     }
     }
}
