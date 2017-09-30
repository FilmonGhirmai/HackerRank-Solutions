package workingArea2;

import java.util.Scanner;

/**
 * Author : Filmon Ghirmai
 * Github : github.com/filmonghirmai
 * HackerRank : hackerrank.com/skynet21
 */
public class toChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        char[] st = str.toCharArray();
        String firstLetterCapital = String.valueOf(st[0]).toUpperCase();
        String leftLetter = str.substring(1,str.length());

        System.out.println(firstLetterCapital);
        System.out.println(leftLetter);

        System.out.println(firstLetterCapital + leftLetter );

    }
}
