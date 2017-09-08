package DataStructures.Arrays;

import java.util.Scanner;

/**
 * Created by skynet on 7/12/17.
 *
 */
public class ReversArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = null ;
        int n = scanner.nextInt();
        if(n > 1000 || n < 1){
            System.out.println("Array number wrong");
            System.exit(0);
        }else {
             arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                int a = scanner.nextInt();
                if(a > 10000 || a < 1){
                    System.out.println("wrong array elements");
                    System.exit(0);
                }else{
                    arr[i] = a;
                }
            }
        }

        System.out.println("\n");
        for (int i = arr.length -1 ; i >= 0 ; i--) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }


    }
}
