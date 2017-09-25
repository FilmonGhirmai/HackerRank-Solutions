package Java.Advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *    Author : Filmon Ghirmai
      Github : github.com/filmonghirmai
  HackerRank : hackerrank.com/skynet21
 *
 */
public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        /* Get and Store the input*/
        String str = in.next();

        /*Hashing the input*/
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] hashedValue = md.digest();

        // %064 since the SHA-256 calculates a hash code that is a 64-digit hexadecimal number.
        // sha-256 is a 256 bit hashing algorithm it undergoes 64 round and calculate 64-digit hexadecimal number
        System.out.format("%064x", new BigInteger(1,hashedValue));

    }
}
