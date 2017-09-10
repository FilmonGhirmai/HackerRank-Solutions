package Thirty_Day_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

/**
 * Created by skynet on 7/22/17.
 *
 12.00
 20
 8
 */
public class Arithemtic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mealCost  = in.nextDouble();
        int tipPercent = in.nextInt();
        int taxPercent = in.nextInt();

        double tip = (mealCost * tipPercent)/100;

        double tax = (mealCost * taxPercent)/100;
        double totalCost = mealCost + tax + tip;

        int total = (int) Math.round(totalCost);
        System.out.println("The total meal cost is " + total + " dollars.");
    }
}
