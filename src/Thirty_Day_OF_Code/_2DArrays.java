package Thirty_Day_OF_Code;

import java.util.Scanner;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
//Day 11: 2D Arrays
public class _2DArrays {

    public static void main(String[] args) {
        int[][] hg = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        //the mini sum of the hourglasess.
        int sum = -63;

        int temp = 0;
        int r1,r2,r3;
        int c1,c2,c3;

        //Getting input
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <= 5; j++) {
                int n = scanner.nextInt();
                if(n > 9 || n < -9){
                    System.out.println("Enter the elements between -9 and 9 only");
                    System.exit(0);
                }else{
                    hg[i][j] =  n;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            r1 = i;
            r2 = i + 1;
            r3 = i + 2;
            for (int j = 0; j < 4; j++) {
                c1 = j;
                c2 = j + 1;
                c3 = j + 2;

                temp = hg[r1][c1] + hg[r1][c2] + hg[r1][c3] +  //first row
                        hg[r2][c2] +                           //second row second element
                        hg[r3][c1] + hg[r3][c2] + hg[r3][c3]  ; // third row

                if(temp > sum){
                    sum = temp;
                }

            }

        }
        System.out.println(sum);
    }
}
