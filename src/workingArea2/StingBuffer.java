package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/24/17.
 */
public class StingBuffer {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       StringBuilder name = new StringBuilder();
        System.out.println("Enter your name...pls");
        name.append(input.nextLine());

        System.out.println("Thank you " + name.toString());
    }
}
