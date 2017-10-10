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
    /* Example factorial of 5
            (5 * 4 * 3 * 2)returned from the recursive step * 1( result returned from the if-condition ) = 120 returned.
            the result from the else statement  is converge with the base case
            and returned back to calling statement.
    * */
    static int factorial(int n) {
        // Complete this function
        if(n <= 1 ){   // Terminating condition
            return 1;  // Base case !1= 1 and !0 is defined as 1
        }else {
            return n * factorial(n - 1);  // Recursive Call or Recursive Step.
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
