package Algorithms;

import java.util.*;

/**
 * Created by skynet on 7/19/17.
 */


//10
  //      18 90 90 13 90 75 90 8 90 43
//
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, long[] ar) {
        // Complete this function
        int count = 0 ;
        //sort the array
        Arrays.sort(ar);
        //find the candle that has maximum height
        long tallest_height = ar[n-1];

            for (int i = 0; i < n; i++) {
                //procced to read the candle heights
                      if(ar[i] == tallest_height)
                          count++;
                  }
        return (count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];

        if(n < 1 || n > 100000) {
            System.exit(0);
        }else{
            for(int ar_i = 0; ar_i < n; ar_i++){
                int input  = in.nextInt();
                if(input < 1 || input > 10000000){
                    System.exit(0);
                }else{
                    ar[ar_i] = input;
                }
            }
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
