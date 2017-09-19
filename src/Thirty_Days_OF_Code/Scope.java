package Thirty_Days_OF_Code;

import java.util.Arrays;
import java.util.Scanner;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 14: Scope

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference (int[] ar){
        elements = ar;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = elements[elements.length -1 ] - elements[0];
    }

}
public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // close the input.
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
