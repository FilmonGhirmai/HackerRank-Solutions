package Thirty_Day_OF_Code;
import java.util.Scanner;
/**
 * Created by skynet on 7/25/17.
 *
 */
public class MultipleOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 2 || n > 20)
            System.exit(0);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n*i);
            }
    }
}
