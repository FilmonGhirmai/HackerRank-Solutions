package Java.Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

@FunctionalInterface
interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // 1 EVEN/ODD Section
     PerformOperation isOdd() {
       return (
                (n) -> {
                    if(n % 2 != 0)
                        return true;
                    else
                        return false;
                }
               );
    }

    // 2 PRIM/COMPOSITE Section
    PerformOperation isPrime() {
        return (
                (n) ->  {
                    int counter = 0 ;
                    for (int i = 1; i <= n; i++) {
                        if(n % i == 0) counter++;
                    }
                    if(counter == 2)
                        return true;
                    else
                        return false;
                }
                );
    }

    // 3 PALINDROME Section
    PerformOperation isPalindrome() {
        // 898
        return (
                (n) -> {
                    String str = String.valueOf(n);
                    String rev = "";
                    for (int i = str.length()-1 ; i >= 0 ; i--) {
                        rev  = rev + str.charAt(i);
                    }
                    if (str.equals(rev))
                        return true;
                    else
                        return false;
                }

                );

    }

}

public class JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {

        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
