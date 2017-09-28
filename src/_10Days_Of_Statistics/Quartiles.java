package _10Days_Of_Statistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 1: Quartiles
public class Quartiles {
    /* A static function that find the median of set */
    public static int findMedian(int[] a ) {
        int a_size = a.length;
        if (a_size % 2 == 0) {
            int medianPosition1 = (a_size / 2 ) -1 ;
            int medianPosition2 = (medianPosition1 + 1);
            return (a[medianPosition1] + a[medianPosition2])/2;
        }else{
           int medianPosition = (a_size / 2)  ;
           return a[medianPosition];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr  = new int[n];

        /* Get the input array*/
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        /* Sort the numbers in the array */
        Arrays.sort(arr);

        /* Find the median */
        int median = 0;
        int firstQuartile = 0 ;
        int secondQuartile = 0;
        int thirdQuartile = 0;

        if (n % 2 == 0) {

            /* fist Quartile */
            int lowerIndex  = (n/2) - 1;
            int[] lowerHalfArray  = new int[lowerIndex + 1];
            for (int i = 0; i <= lowerIndex; i++) {
                lowerHalfArray[i] = arr[i];
            }
            firstQuartile = findMedian(lowerHalfArray);


            /* Third Quartile */
            int upperIndex = n/2;
            int[] upperHalfArray = new int[upperIndex];
            for (int i = upperIndex, j = 0; i < arr.length; i++,j++) {
                upperHalfArray[j] = arr[i];
            }
            thirdQuartile = findMedian(upperHalfArray);

            /* Second Quartile */
            secondQuartile = (arr[lowerIndex] + arr[upperIndex]) / 2 ;


        }
        else {
            median = (n/2); // Also it is second quartile.

            /* lower half */
            int[] l = new int[median];
            for (int i = 0; i < median ; i++) {
                l[i] = arr[i];
            }
            firstQuartile = findMedian(l);

            /* upper half */
            int[] u = new int[median];
            for (int i = median + 1,j = 0; i <= arr.length -1 ; i++,j++) {
                u[j] = arr[i];
            }
            thirdQuartile = findMedian(u);

            /* the second quartile */
            secondQuartile = arr[median];

        }

        /* Printing the Quartiles */

        System.out.println(firstQuartile);
        System.out.println(secondQuartile);
        System.out.println(thirdQuartile);

    }
}
