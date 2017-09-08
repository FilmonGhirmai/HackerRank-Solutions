package DataStructures.Arrays;

import java.util.Scanner;

/**
 * Created by skynet on 7/15/17.
 *
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // number of element in th string array
        int n  ;
        // sparse array
        String[] sparseArray  ;
        // query number
        int q = 0;
        int[] freq ;
        int counter ;

        // Getting the inputs
        n = scanner.nextInt();
        if(n < 1 || n > 1000){
            System.exit(0);
        }else{
            sparseArray = new String[n];
            for (int i = 0; i < n ; i++) {
                String str = scanner.next();
                if (str.length() < 1 || str.length() > 20) {
                    System.exit(0);
                } else {
                    sparseArray[i] = str;
                }
            }
            q = scanner.nextInt();
            if(q < 1 || q > 1000){
                System.exit(0);
            }
           freq = new int[q];
            for (int i = 0; i < q; i++) {
                counter = 0;
                String str  = scanner.next();
                for (int j = 0; j < sparseArray.length; j++) {
                    if (sparseArray[j].equals(str)) {
                        counter++;
                        freq[i] = counter;
                    }
                }
            }

            //print the output
            for (int i = 0; i < freq.length; i++) {
                System.out.println(freq[i]);
            }

        }


    }
}
