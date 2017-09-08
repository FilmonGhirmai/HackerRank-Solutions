package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 *
 * Created by skynet on 7/17/17.
 */
public class DaynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
     List<List<Integer>> lists = new ArrayList<>();
     while(k < 4){
         List<Integer> list = new ArrayList<>();
         System.out.println("Enter the number of elements ");
         int n = in.nextInt();
         for (int i = 0; i < n; i++) {
             list.add(in.nextInt());
         }
         System.out.println("list of " + k + "is created");
         System.out.println(list.get(k));
         System.out.println("");
         k++;
     }

    }
}