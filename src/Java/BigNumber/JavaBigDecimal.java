package Java.BigNumber;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
   static ArrayList<String> list ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1 || n > 200)
            System.exit(0);

        String []s = new String[n];
        for(int i=0 ;i<n ;i++){
            String input ;
            input = sc.next();
            s[i] = input;
        }
        sc.close();
        //Write your code here
        Comparator<String> myComparator = (o1, o2) -> {
            java.math.BigDecimal a = new java.math.BigDecimal(o1);
            java.math.BigDecimal b = new java.math.BigDecimal(o2);
            return b.compareTo(a); // descending order.
        };
        Arrays.sort(s,0,n,myComparator);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
        sc.close();
    }

}
