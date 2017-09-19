package Thirty_Days_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;
// Day 10: Binary Numbers

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int longestSequence = 0;
        if(n >=1 && n <=1000000){
            String  bin = Integer.toBinaryString(n);
             String[] allOnce = bin.split("0");
            for (int i = 0; i < allOnce.length; i++) {
                if(allOnce[i].length() > longestSequence){
                    longestSequence = allOnce[i].length();
                }
            }
        }
        System.out.println(longestSequence);
    }
}
