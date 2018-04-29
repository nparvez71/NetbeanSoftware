package october22;
import java.util.Arrays;
import java.util.Scanner;
public class October22 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int[][]n= new int[2][2];
        System.out.println("Enter nub");
        n[0][0]=s.nextInt();
        System.out.println("Enter nub");
        n[0][1]=s.nextInt();
        
        System.out.println("Enter nub");
        n[1][0]=s.nextInt();
        System.out.println("Enter nub");
        n[1][1]=s.nextInt();
        shorting (n);
    }
     public static void shorting(int[] []n){
     for(int[]d:n){
     Arrays.sort(d);
     for(int a:d){System.out.print(a+"");}
         System.out.println("");
     }
     }
}
