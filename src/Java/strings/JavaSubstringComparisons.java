package Java.strings;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class JavaSubstringComparisons {
    static ArrayList<String> list = new ArrayList<>();
    public static String getSmallestAndLargest(String s, int k) {

        //Program constraint condition
        if(s.length() < 1 || s.length() > 1000)
            System.exit(0);

        //Input String should be english alphabets only
        if(!s.matches("[a-zA-Z]+"))
            System.exit(0);

        //extract the sub string from the given input.
        for (int i = 0; i < s.length()-k+1; i++) {
            list.add(s.substring(i,i+k));
        }
        System.out.println(list);
        //Sort the sub string... then retrun the first and last string from the list.
        Collections.sort(list);
        return list.get(0) + "\n" + list.get(list.size()-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
}
