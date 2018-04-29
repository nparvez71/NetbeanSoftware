
import java.util.Scanner;


public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if(x>y && x>z){
            System.out.println(x+" is big");
        }else if(y>x && y>z){
            System.out.println(y+" is big");
        }else{
            System.out.println(z+" is big");
        }
        
        if(x<y && x<z){
            System.out.println(x+" is small");
        }else if(y<x && y<z){
            System.out.println(y+" is small");
        }else{
            System.out.println(z+" is small");
        }
    }
}
