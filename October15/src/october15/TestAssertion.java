
package october15;

import java.util.Scanner;


public class TestAssertion {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age");
        int value=s.nextInt();
        assert value>=18:"not valid";
        System.out.println("value is "+value);
    }
}
