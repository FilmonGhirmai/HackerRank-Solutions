package Thirty_Day_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Day 8: Dictionaries and Maps
public class DictionariesAndMaps {
    public static void main(String []argh) {
        Map<String,Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1 || n > 100000) {
            System.exit(0);
        } else {
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                map.put(name,phone);
            }
            while (in.hasNext()) {
                String s = in.next();
                // Write code here
                if(map.get(s) != null)
                System.out.println(s + "=" + map.get(s));
                else{
                    System.out.println("Not found");
                }
            }
            in.close();
        }

    }
}
