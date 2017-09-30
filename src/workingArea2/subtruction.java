package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
/* (2) java program to subtract 2 numbers*/

public class subtruction {

    public static void main(String[] args) {
        int d = 0;
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];

        System.out.println("Enter the numbers...pls");
        for(int i = 0 ; i<=1 ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Printing the numbers...");
        for (int i = 0; i <=1; i++) {
            System.out.println(a[i]);
        }

        System.out.println("The deference between the numbers is : " + (a[0]-a[1]));
    }
}
