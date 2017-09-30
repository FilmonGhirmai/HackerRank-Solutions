package workingArea;

import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/16/17.
 * Software Developer
 */
public class Optimazation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = (n/2) * (1 + n);
        System.out.println(sum);
    }
}
