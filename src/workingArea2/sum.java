package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
/*  (1) java program to add N numbers*/

public class sum {
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers");
        int k = sc.nextInt();
        int[] num = new int[k];

        System.out.println("Enter the numbers");
        for(int i= 0 ; i< k ; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Printing the numbers...");
        for(int j= 0 ; j< k; j++){
            System.out.println(num[j]);
        }

        for(int m= 0 ; m< k ; m++){
            sum = sum + num[m];
        }

        System.out.println("sum is: " + sum );
    }
}
