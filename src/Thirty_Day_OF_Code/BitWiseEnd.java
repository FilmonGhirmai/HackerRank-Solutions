package Thirty_Day_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

public class BitWiseEnd {
    /*
    * @param args - Array of Strings
    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t < 1 || t > 1000)
            System.exit(0);
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            if ((k-1 | k) <= n)
                System.out.println(k-1);
             else
                System.out.println(k-2);
        }
    }
}
