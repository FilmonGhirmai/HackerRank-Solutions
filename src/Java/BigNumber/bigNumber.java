package Java.BigNumber;

import java.awt.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by skynet on 8/1/17.
 */
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
