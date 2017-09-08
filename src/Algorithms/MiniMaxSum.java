package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by skynet on 7/19/17.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        long min = 0;
        long max = 0;
        Scanner in = new Scanner(System.in);
        long[] ar = new long[5];
        for (int i = 0; i < 5; i++) {
            long input = in.nextLong();
            if(input < 1 || input > 1000000000){
                System.exit(0);
            }else{
                ar[i] = input;
            }
        }
        //do the operation
        Arrays.sort(ar);
        //max value when excluding first element;
        for (int i = 1; i < 5; i++) {
            max = max + ar[i];
        }
        //min value when excluding  the last element;
        for (int i = 0; i < 4 ; i++) {
            min = min + ar[i];
        }
        //outputting the min and max value
        System.out.print(min + " " + max);

    }
}
