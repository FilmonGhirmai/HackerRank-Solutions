package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
public class SumN {
    double sum = 0;
    String s = String.valueOf(0);
    public double sum(double x){
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
            s = s + "+" + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number...");
        double d = ss.nextInt();
        SumN n = new SumN();
        double result = n.sum(d);
        System.out.println(n.s.toString());
        System.out.println(result);
    }
}
