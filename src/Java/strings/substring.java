package Java.strings;

import java.util.Scanner;

/**
 *
 * Created by skynet on 7/29/17.
 */
public class substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        if(S.length() >=1 && S.length() <= 100){
            int start = in.nextInt();
            int end = in.nextInt();
            if(start >= 0 && start < end && end <= S.length()){
                System.out.println(S.substring(start,end));
            }
        }
    }
}
