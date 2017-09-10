package Java.Strings;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

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
