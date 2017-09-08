package Java.dataStructure;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/** Program : Java Deque*/
/**
  Sample input
  6 3
  5 3 5 2 3 2

  Sample output
  3
* */

public class JavaDeque {
    public static void display(){


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
    }
}
