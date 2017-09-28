package _10Days_Of_Statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
// Day 1: Interquartile Range

public class InterquartileRange {
    /* A static function that find the median of set */
    public static double findMedian(int[] a ) {
        int a_size = a.length;
        if (a_size % 2 == 0) {
            int medianPosition1 = (a_size / 2 ) -1 ;
            int medianPosition2 = (medianPosition1 + 1);
            return (a[medianPosition1] + 0.0 + a[medianPosition2])/2;
        }else{
            int medianPosition = (a_size / 2)  ;
            return a[medianPosition];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        int[] frequency = new int[n];

        /* Get the input array elements  */
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        /* Get the frequency element for the array */
        for (int i = 0; i < n; i++) {
            frequency[i] = in.nextInt();
        }

        /* Creating the data set*/
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = frequency[i];
            for (int j = 0; j < k ; j++) {
                list.add(arr[i]);
            }
        }

        /* Sort the data set */
        Collections.sort(list);

       /* Find the median */
        int median = 0;
        double firstQuartile = 0 ;
        double thirdQuartile = 0;

        if (n % 2 == 0) {

            /* fist Quartile */
            int lowerIndex  = (list.size()-1)/2;
            int[] lowerHalfArray  = new int[lowerIndex + 1];
            for (int i = 0; i <= lowerIndex; i++) {
                lowerHalfArray[i] = list.get(i);
            }
            firstQuartile = findMedian(lowerHalfArray);


            /* Third Quartile */
            int upperIndex = list.size()/2;
            int[] upperHalfArray = new int[upperIndex];
            for (int i = upperIndex, j = 0; i < list.size() -1; i++,j++) {
                upperHalfArray[j] = list.get(i);
            }
            thirdQuartile = findMedian(upperHalfArray);

        }
        else {
            median = (list.size()-1)/2; // Also it is second quartile.

            /* lower half */
            int[] l = new int[median];
            for (int i = 0; i < median ; i++) {
                l[i] = list.get(i);
            }

            firstQuartile = findMedian(l);

            /* upper half */
            int[] u = new int[median];
            for (int i = median + 1,j = 0; i <= list.size()-1 ; i++,j++) {
                u[j] = list.get(i);
            }

            thirdQuartile = findMedian(u);

        }

        /* Finding  Interquartile Range and Printing to the console */
        System.out.println(thirdQuartile - firstQuartile);
    }

}
