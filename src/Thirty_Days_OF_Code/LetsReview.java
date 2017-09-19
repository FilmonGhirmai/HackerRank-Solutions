package Thirty_Days_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

// Day 6: Let's Review
public class LetsReview {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t < 1 && t > 10){
            System.exit(0);
        }else {
            for (int j = 0; j < t; j++) {
                String str = in.next();
                if (str.length() >= 2 && str.length() <= 10000) {
                    String strEven = ""; String strOdd = "";
                    char[] strArray = str.toCharArray();
                    for (int i = 0; i < strArray.length; i++) {
                        if (i % 2 == 0)
                            strEven = strEven + String.valueOf(strArray[i]);
                        else
                            strOdd = strOdd + String.valueOf((strArray[i]));
                    }
                    System.out.print(strEven);
                    System.out.print(" ");
                    System.out.print(strOdd);
                    System.out.println();
                }
                else {
                    System.exit(0);
                }

            }
        }
    }
}
