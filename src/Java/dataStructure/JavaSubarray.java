package Java.dataStructure;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int sum   = 0;

        int n = in.nextInt();
        if(n < 0 || n > 100 )System.exit(0);

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if(input < -10000 || input > 10000)System.exit(0);
            array[i] = input;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    counter++;
                }
            }
            sum = 0;
        }

        System.out.println(counter);
    }
}
