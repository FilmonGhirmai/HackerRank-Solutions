package Java.DataStructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/31/17.
 * Software Developer
 */
/**
* Sample Input

 5
 john tom
 john mary
 john tom
 mary anna
 mary anna

 Sample Output

 1
 2
 2
 3
 3

 * */
public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }

    }
}
