package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/25/17.
 * Software Developer
 */
public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.
        if(n.toString().length() > 300)
            System.exit(0);

        if(n.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
