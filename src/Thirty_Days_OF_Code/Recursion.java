package Thirty_Days_OF_Code;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

// Day 9: Recursion
public class Recursion {

    static int factorial(int n) {
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
        if(n >=1 && n <= 12){
            int result = factorial(n);
            System.out.println(result);
        }
    }
}
