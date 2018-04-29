package october15;
import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        int[] arr =new int[4];
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        arr[0]=s.nextInt();
          arr[1]=s.nextInt();
            arr[2]=s.nextInt();
              arr[3]=s.nextInt();
            //  int min=getminValue(arr);
              System.out.println("min "+getminValue(arr));
    }
    public static int getminValue(int []array) {
    int minValue=array[0];
    for(int i=1;i<array.length;i++)
    {
        if(array[i]<minValue){minValue=array[i];}
    }
    return minValue;
    }
}
