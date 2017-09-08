package DataStructures.Arrays;

import java.util.Scanner;

/**
 * Created by skynet on 7/14/17.
 */
public class Shifting {
    public static void main(String[] args) {
        int[] arr = null;
        int[] temp = null ;
        int n ;
        int d ;
        int shiftingValue  ;

        //Scanner
        Scanner scanner = new Scanner(System.in);

        // Get the inputs
        System.out.println("Enter array number and shifting value separated by space");
        n = scanner.nextInt();
        d = scanner.nextInt();

        if(d > n || d < 1 || n > 100000 || n < 1){
            System.out.println("wrong  input");
            System.exit(0);
        }else{
            arr  = new int[n];
            temp = new int[n];
            System.out.println("Enter the " + n + " elements");
            for (int i = 0; i < arr.length; i++) {
                //check if the input meet the constraints
                int input = scanner.nextInt();
                if(input < 1 || input > 1000000) {
                    System.out.println("Wrong array item");
                    System.exit(0);
                }else
                    arr[i] = input;
            }
        }


        //calculate the shifting value;
        if(d > arr.length){
            shiftingValue = d % arr.length;
        }else{
            shiftingValue = d;
        }

        //shifting array
        for (int i = 0; i < arr.length; i++) {
            int newindex = i - shiftingValue;
            if (newindex < 0) {
                newindex = arr.length + newindex ;
                temp[newindex] = arr[i] ;
            } else {
                temp[newindex] = arr[i];
            }
        }

        //printing array
//        System.out.println("original array is :" + DataStructures.Arrays.toString(arr));
//        System.out.println("shifted  array is :" + DataStructures.Arrays.toString(temp));
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            System.out.print(" ");
        }

    }
}
