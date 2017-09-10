package Algorithms;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;
public class sumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum  = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }
}
