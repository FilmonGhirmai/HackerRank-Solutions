package Java.DataStructure;

import java.util.BitSet;
import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 Follow me on twitter : @
 *
 */

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // N is the length of B1 and B2 sets
       // int N = in.nextInt();
        // M is the number of operation to perform on B1 and B1
      //  int M = in.nextInt();

        BitSet b1 = new BitSet(5);
        BitSet b2 = new BitSet(5);

        for (int i = 0; i < 5; i++) {
             b1.set(0);
             b2.set(0);
        }

        System.out.print("b1: ");
        System.out.print(b1);

        System.out.println();

        System.out.print("b2: ");
        System.out.print(b2);

        System.out.println();
        b1.and(b2);

        System.out.println("b1 AND b2 " + b1);

        b1.or(b2);
        System.out.println("b1 OR  b2 " + b1);
    }
}
