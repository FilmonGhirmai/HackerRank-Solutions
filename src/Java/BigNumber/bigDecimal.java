package Java.BigNumber;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/25/17.
 * Software Developer
 */
public class bigDecimal {
   static ArrayList<String> list ;
    public static void main(String[] args) {
      //  BigDecimal bigDecimal =
        //Input
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
            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);
            return b.compareTo(a); // descending order.
        };
        Arrays.sort(s,0,n,myComparator);

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

    }

}
