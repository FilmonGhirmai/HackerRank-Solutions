package Thirty_Day_OF_Code;

import java.util.Scanner;

/**
 * Created by skynet on 7/29/17.
 *
 */
public class Factorial {
        static double factorial(int n) {
            // Complete this function
            if(n > 1 ){
                return n * (factorial(n-1));
            }else{
                return n;
            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if(n >= 1 && n <=100) {
                double result = factorial(n);
                System.out.println(result);
            }
        }
}
