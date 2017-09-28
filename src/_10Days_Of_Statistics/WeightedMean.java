package _10Days_Of_Statistics;

import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 0: Weighted Mean
public class WeightedMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //first array
        int[] arr_1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr_1[i] = in.nextInt();
        }

        //second array
        int[] arr_2 = new int[n];
        float arr_2_sum = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            arr_2[i] = input;
            arr_2_sum = arr_2_sum + input;
        }
        in.close();

        /* 1 Calculation of the Numerator */
        float NumeratorValue = 0;
        for (int i = 0; i < n; i++) {
            int k = arr_1[i] * arr_2[i];
            NumeratorValue = NumeratorValue + k;
        }

        /* 2 Calculation of the Denominator
         It is  Already calculated while we are getting the second array input
         * That is arr_2_sum */

        /* 3 weighted mean */
        float weightedMean = NumeratorValue/arr_2_sum;
        System.out.printf("%.1f",weightedMean);
    }
}
