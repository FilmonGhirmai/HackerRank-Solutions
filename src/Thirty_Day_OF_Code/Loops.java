package Thirty_Day_OF_Code;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

// Day 5: Loops
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n < 2 || n > 20)
            System.exit(0);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
