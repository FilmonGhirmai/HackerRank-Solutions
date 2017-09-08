package Java.introduction;
/*
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        String B = sc.next().toLowerCase();
        //get the size of A and B combined;
        String AB = A + B;
        String lexo;
        int stringSize = AB.length();
        ArrayList<String> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        Collections.sort(list);
        if(list.get(0).equals(A)){
                lexo = "No";
        }else{
                lexo = "Yes";
        }

        String a = A.replace(A.substring(0,1),A.substring(0,1).toUpperCase());
        String b = B.replace(B.substring(0,1),B.substring(0,1).toUpperCase());

        System.out.println(stringSize);
        System.out.println(lexo);
        System.out.println(a + " " + b );
    }

}
