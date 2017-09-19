package Thirty_Days_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

// Day 1: Data Types

public class DataTypes {
    public static void main(String[] args) {
        int i;
        double d ;
        String s ;

        int ii = 2;
        double dd = 3.0;
        String ss = "hackerrank! ";

        String junk ;

        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        d = in.nextDouble();
        junk = in.nextLine();
        s = in.nextLine();

        double sum = d + dd;
        System.out.println(i + ii);
        System.out.println(sum);
        System.out.println(ss + " " + s);

    }
}
