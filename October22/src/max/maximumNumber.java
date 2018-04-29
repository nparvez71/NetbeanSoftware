
package max;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.println("enter number");
           int[] arr=new int[4];
           arr[0]=s.nextInt();
          arr[1]=s.nextInt();
          arr[2]=s.nextInt();
          arr[3]=s.nextInt();
          int min=getmax(arr);
          System.out.println("max"+getmax(arr));
    }
           
        public static int getmax(int[]array){
        int maxValue=array[0];
        for(int i=1;i<array.length;i++){
        if(array[i]>maxValue){maxValue=array[i];}
        }return maxValue;
        }
}
