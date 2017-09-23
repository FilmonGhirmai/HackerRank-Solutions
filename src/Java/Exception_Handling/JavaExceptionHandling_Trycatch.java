package Java.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
public class JavaExceptionHandling_Trycatch {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(x/y);
            } catch (ArithmeticException ae) {
                //System.out.println(ae.getClass().getCanonicalName());
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        } catch (InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
