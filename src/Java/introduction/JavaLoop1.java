package Java.introduction;

import java.util.Scanner;

/**
 * Created by skynet on 7/20/17.
 *
 */

public class JavaLoop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N < 2 || N > 20){
            System.exit(0);
        }else{
            for (int i = 1; i < 10; i++) {
                System.out.println(N + " x " + i + " = " + (N*i));
            }
        }
    }
}
