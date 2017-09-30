package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/27/17.
 *
 */

public class ReadChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string...pls");
        char c = scanner.next().charAt(0);
        System.out.println("c = " + c);
    }
}
