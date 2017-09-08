package Thirty_Day_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

public class StringToInteger {
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
