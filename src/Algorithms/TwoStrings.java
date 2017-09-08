package Algorithms;

import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/6/17.
 * Software Developer
 */
public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        // Complete this function
        int a = 2 ;
        int b = 3 ;
        int c = (int) Math.pow(a,b);

        int count = 0;
        for (int j = 0; j < s1.length(); j++) {
           // s1.matches(s2)
            if (s1.charAt(j) == s2.charAt(j)) {
                return "YES";
            }
        }
        if (count > 0)
            return "YES";
        else
            return "NO";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b;

        int p = in.nextInt();
        if (p < 1 || p > 10)
            System.exit(0);

        for (int i = 0; i < p; i++) {
            a = in.next().toLowerCase();
            b = in.next().toLowerCase();
            if (a.length() < 1 || a.length() > 100000 || b.length() < 1 || b.length() > 100000)
                System.exit(0);
            String result = twoStrings(a, b);
            System.out.println(result);

        }
    }
}