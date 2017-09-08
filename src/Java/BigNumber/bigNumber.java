package Java.BigNumber;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.math.BigInteger;
import java.util.Scanner;


public class bigNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bigInteger1 ;
        BigInteger bigInteger2 ;
        bigInteger1 = in.nextBigInteger();
        bigInteger2 = in.nextBigInteger();

        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}
