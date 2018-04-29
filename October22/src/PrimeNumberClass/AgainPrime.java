
package PrimeNumberClass;

import java.util.Scanner;

public class AgainPrime {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        Checkprime(n);
        
    }

    private static void Checkprime(int n) {
        int i,m=0,flag=10;
        m=n/2;
        if(n==0||n==1){System.out.println("not Prime");
        flag=1;}
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){System.out.println("not prime");
                flag=1;
                break;}
                        } }
        if(flag==10){System.out.println("prime");}
        }
}
