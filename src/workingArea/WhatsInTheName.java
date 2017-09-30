package workingArea;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by skynet on 7/28/17.
 *
 */
public class WhatsInTheName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int t = in.nextInt();
        if (t < 1 || t > 100) {
            System.exit(0);
        }
        else {
            for (int i = 0; i <t ; i++) {
                StringTokenizer st = new StringTokenizer(in.nextLine(), " ");
                String s = " " ;
                while (st.hasMoreTokens()) {
                   list.add( list.get(i) + st.nextToken());
                }
            }

            }

        //System.out.println(nameFormat( ("filmon ghirmai ghebremedhi                 ").split(" ")));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(nameFormat(list.get(i).split(" ")));
        }
    }

    static String nameFormat(String[] s){
        int c = s.length;
        if (c == 1) {
            String fn = s[0].replace(s[0].substring(0,1),s[0].substring(0,1).toUpperCase());
            return fn;

        } else if (c == 2) {
            String fn = s[0].replace(s[0].substring(0, 1), s[0].substring(0, 1).toUpperCase());
            String mn = s[1].replace(s[1].substring(0, 1), s[1].substring(0, 1).toUpperCase());
            String ss = fn.substring(0,1) + ". " + mn ;
             return ss;
        }
        else  {
            String fn = s[0].replace(s[0].substring(0, 1), s[0].substring(0, 1).toUpperCase());
            String mn = s[1].replace(s[1].substring(0, 1), s[1].substring(0, 1).toUpperCase());
            String ln = s[2].replace(s[2].substring(0, 1), s[2].substring(0, 1).toUpperCase());
            String sss = fn.substring(0,1) + ". " + mn.substring(0,1) + ". " + ln;
           return sss;
        }

    }

}
