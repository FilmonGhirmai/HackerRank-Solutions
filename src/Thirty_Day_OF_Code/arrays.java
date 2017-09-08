package Thirty_Day_OF_Code;

import java.util.Scanner;

/**
 * Created by skynet on 7/27/17.
 */
public class arrays {
    public static void main(String[] args) {
        int arr[] = null;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 1 && n > 1000){
            System.exit(0);
        }
        else{
            arr  = new int[n];
                for (int i = 0; i < n; i++) {
                    int m  = in.nextInt();
                    if(m < 1 && m > 10000)
                        System.exit(0);
                    else
                        arr[i] = m;
            }
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
