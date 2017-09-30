package workingArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Created by skynet on 7/22/17.
 *
 */

public class Sample {
    public static void main(String[] args) {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner in = new Scanner(input);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name ");
        String name = null;
        try {
            name = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thanks For Your interest..." + name);
        }
        //scanner
        System.out.println("From file " + in.nextInt() );
        System.out.println("From file " + in.nextInt() );
        System.out.println("From file " + in.next() );
        System.out.println("From file " + in.next() );

    }

}
