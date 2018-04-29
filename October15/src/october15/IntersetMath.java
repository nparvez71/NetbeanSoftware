package october15;

import java.util.Scanner;

public class IntersetMath {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("calculate interest");
        System.out.println("write amount");
        float amount = s.nextFloat();
        System.out.println("write rate");
        float rate = s.nextFloat();
        System.out.println("write annual time");
        float time = s.nextFloat();
        float interest = calInterest(amount, rate, time);
        float sss = amount + interest;
        System.out.println("simp interest:" + interest + "int+amount" + sss);
    }

    public static float calInterest(float amount, float rate, float time) {
        float interest = (amount * rate * time) / 100;
        return interest;
    }
}
