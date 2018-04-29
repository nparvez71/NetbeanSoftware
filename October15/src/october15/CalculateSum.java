package october15;
import java.util.Scanner;
public class CalculateSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numb");
        int sn = s.nextInt();
         System.out.println("Enter numb");
        int en = s.nextInt();
        calculateSum(sn, en);   }
    public static void calculateSum(int sn, int en) {
        int sum = 0;
        if (sn < en) {
            for (int i = sn; i <= en; i++) {
                sum += i;            }
        }
            else {
                    for (int i=sn;i >= en; i--){
        sum+=i;}}
            System.out.println("sum" + sum);
        }
    }

