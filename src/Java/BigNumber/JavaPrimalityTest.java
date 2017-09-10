package Java.BigNumber;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.math.BigInteger;
import java.util.Scanner;
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
