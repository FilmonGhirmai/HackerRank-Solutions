package Java.introduction;

import java.util.Scanner;

/**
 * Created by Filmon Ghirmai
 * gfilmon
 */
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
