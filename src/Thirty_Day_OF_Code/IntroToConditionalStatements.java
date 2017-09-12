package Thirty_Day_OF_Code;

import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 3: Intro to Conditional Statements
public class IntroToConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";
        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n >= 2 && n <=5)
                ans = "Not Weird";
            else if(n >=6 && n<=20)
                ans = "Weird";
            else if(n > 20)
                ans = "Not Weird";

        }
        System.out.println(ans);
    }

}
