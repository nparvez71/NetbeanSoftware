
package OddEven;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 123...");
        int n=s.nextInt();
        CheckOddOrEven(n);
    }

    private static void CheckOddOrEven(int n) {
        
       if(n%2==0){System.out.println( " is even");} 
       else{System.out.println( " is odd");}
       }
    
    
}
