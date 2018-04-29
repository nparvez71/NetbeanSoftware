package max;

import java.util.Scanner;

public class Maxagain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter num");
        int[] arr = new int[3];
        arr[0] = s.nextInt();
        arr[1] = s.nextInt();
        arr[2] = s.nextInt();
        int min = maxvalue(arr);
        System.out.println("max" + maxvalue(arr));
    }
    
    private static int maxvalue(int[] arry) {
        int maxvalue=arry[0];
        for(int i=1;i<arry.length;i++){
        if(arry[i]>maxvalue){maxvalue=arry[i];}
        }
        return maxvalue;
    }
    
}
