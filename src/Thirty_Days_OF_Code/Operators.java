package Thirty_Days_OF_Code;

import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
 Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 2: Operators

public class Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage like 20,30 ..
        int taxPercent = scan.nextInt(); // tax percentage like 8,4 ...
        scan.close();

        /*Note:
            Integer division by Integer result integer,so we calculate mealCost * tipPercent
            first to get a double result so that we will not lose value after dot.
        *  calculating ->  mealCoast * (tipPercent/100) will lead us to loss value after dot.
        * */

        double tip = (mealCost * tipPercent)/100;
        double tax = (mealCost * taxPercent)/100;
        double totalCost = mealCost + tax + tip;

        int total = (int) Math.round(totalCost);
        System.out.println("The total meal cost is " + total + " dollars.");
    }

}
