package workingArea;

import java.util.Scanner;

/**
 * Created by skynet on 8/3/17.
 *
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // Declare an object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
        String str = "ki";

        // Initialize sum and count of input elements
        int sum = 0;
        // Check if an int value is available
        for (int i = 0; i < 2; i++) {
            String line = sc.nextLine();
            Scanner inFromString = new Scanner(line);
            while (inFromString.hasNextInt()){
                sum = sum + inFromString.nextInt();
            }
            System.out.println("sum : " + sum );
            sum = 0;
        }
        sc.close();
    }
}
