package _10Days_Of_Statistics;

import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
// Day 1: Standard Deviation
public class StandardDeviation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];


        /* Get the input array*/
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int input = in.nextInt();
            arr[i] = input;
            sum = sum + input;
        }

        /* Calculate the mean of the numbers */
        int mean = sum / n ;

        /* Calculate the square distance from the mean , square(Xi-mean) */
        double squareDistance = 0;
        for (int i = 0; i < n; i++) {
            squareDistance = squareDistance + Math.pow((arr[i] - mean),2);
        }

        /* Finally calculate the sigma and printing to the console */
        double sigma = Math.sqrt(squareDistance/n);
        System.out.printf("%.1f",sigma);
    }
}
