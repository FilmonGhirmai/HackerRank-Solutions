package workingArea2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by skynet on 4/25/17.
 *
 */

public class ArrayClass {
        private int[] unsortedInt ;
        private String str;
        private String s[];

    private ArrayClass(int n) {
       unsortedInt = new int[n];
    }

    private void sortArray(CharSequence charSequence){
        str = charSequence.toString();
        s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            unsortedInt[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(unsortedInt);
        System.out.println("printing the sorted array....");
        for (int i = 0; i < unsortedInt.length; i++) {
            System.out.print(unsortedInt[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements...pls");
        int size = input.nextInt();


        System.out.println("Enter the array of elements separated by space");
        CharSequence data  = sc.nextLine();

        ArrayClass ac = new ArrayClass(size);
                   ac.sortArray(data);

    }
}
