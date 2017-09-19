package Thirty_Days_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

// Day 16: Exceptions - String to Integer
public class ExceptionsStringToInteger {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            if(S.length() < 1 || S.length() > 6)
                System.exit(0);
            Integer parsedString = Integer.parseInt(S);
            System.out.println(parsedString);
        }
        catch (Exception  e) {
            System.out.println("Bad String");
        }


    }
}
