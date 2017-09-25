package Java.Advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
public class JavaMD5 {
    public static void main(String[] args) {
       Scanner in  = new Scanner(System.in) ;
       String pass = in.next();
       //we create an instance of the class MessageDigest
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pass.getBytes());
            byte[] digestedString = md.digest();
            System.out.format("%032x\n", new BigInteger(1,digestedString));
        } catch (NoSuchAlgorithmException e) {
            //do nothing at least for this program
        }

    }
}
