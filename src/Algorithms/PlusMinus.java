package Algorithms;

import java.util.Scanner;

/**
 * Created by skynet on 7/19/17.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pe = 0 ;
        float ne = 0;
        float ze = 0;
        int n = in.nextInt();
        int input ;
        for(int i = 0; i < n; i++){
             input = in.nextInt();
            if(input > 0 )
                pe++;
            else if (input < 0)
                ne++;
            else
                ze++;
        }

        System.out.println(pe/n);
        System.out.println(ne/n);
        System.out.println(ze/n);
    }
}