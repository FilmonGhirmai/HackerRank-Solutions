package Algorithms;

import java.util.Scanner;

/**
 * Created by skynet on 7/19/17.
 */
public class DiagonalDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first_diagonal_sum = 0 ;
        int second_diagonal_sum = 0;
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int input = in.nextInt();
                if(input < -100 || input >100){
                    System.exit(0);
                }else{
                 //Getting the first diagonal out of the given NxN array
                    ar[i][j] = input;
                }
            }
        }
        //first Diagonal sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j)
                    first_diagonal_sum = first_diagonal_sum + ar[i][j];
            }
        }
        //second diagonal sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j == n-1)
                second_diagonal_sum = second_diagonal_sum + ar[i][j];
            }
        }
        //compute the diff between the diagonals sum
        int sum = first_diagonal_sum - second_diagonal_sum;
        System.out.println(Math.abs(sum));

    }
}
