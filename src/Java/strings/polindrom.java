package Java.strings;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

import java.util.Scanner;

public class polindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(A.length() <= 50){
            String polin = reverse(A);
            if(A.equals(polin))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    static  String reverse(String str){
        String rev = "";
        for (int i = str.length()-1; i >=0  ; i--) {
                rev  = rev + str.charAt(i);
        }
        return rev;
    }
}
