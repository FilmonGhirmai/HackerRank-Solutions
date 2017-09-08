package Java.introduction;

/**
 *   Author : Filmon Ghirmai
 Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;
public class Stin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String junk = scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
