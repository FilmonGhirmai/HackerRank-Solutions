package Java.strings;


import java.util.Collections;
import java.util.Scanner;

/**
 * Created by skynet on 7/30/17.
 */
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