package october15;
import java.util.Scanner;
public class Max {
     public static void main(String[] args) {
        int[] arr =new int[4];
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        arr[0]=s.nextInt();
          arr[1]=s.nextInt();
            arr[2]=s.nextInt();
              arr[3]=s.nextInt();
              int min=getmaxValue(arr);
              System.out.println("max "+getmaxValue(arr));
    }
    public static int getmaxValue(int []array) {
    int maxValue=array[0];
    for(int i=1;i<array.length;i++)
    {
        if(array[i]>maxValue){maxValue=array[i];}
    }
    return maxValue;
    }
}
