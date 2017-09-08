package Java.strings;

import java.util.Scanner;

/**
 * Created by skynet on 7/30/17.
 */
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
