package Java.strings;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

import java.util.Scanner;

public class tokens {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
             String str = s.trim();
            if(str.length() >=1 && str.length() <= 400000 ){
                String[] tokens = str.split("[ .,_@'?!]+");
                System.out.println(tokens.length);
                for(String token : tokens){
                    System.out.println(token);
                }
            }else if(str.length() == 0){
                System.out.println(0);
            }
            scan.close();
        }

}
