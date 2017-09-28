package _10Days_Of_Statistics;
import java.util.*;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 0: Mean, Median, and Mode
public class Mean_Median_Mode {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int[] arr = new int[n];
        double sum_arr = 0;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            arr[i] = input;
            sum_arr = sum_arr + input;

            if (set.add(input)) {
                map.put(input, 1);
            } else {
                map.put(input,map.get(input) + 1);
            }

        }
        in.close();  // close the "in" object

        /*mean value*/
        System.out.format("%.1f" ,(sum_arr/n));

        /*median value*/
         //sort the arr
         Arrays.sort(arr);
        if (n % 2 == 0) {
            int medianX1 = (n/2)  ;          // position at x4
            int medianX2 = medianX1 - 1;     // position at x5
            double median = (arr[medianX1] + arr[medianX2] + 0.0 )/2;  // adding 0.0 to get the value after the dot.
            System.out.format("\n%.1f\n",median );
        }else{
            int median_pos = n/2;
            System.out.println(arr[median_pos]);
        }

        /*mode value*/
        int moreOccurrence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > moreOccurrence) {
                moreOccurrence = map.get(arr[i]);
            }
        }

        set.clear();
        for (int i = 0; i < map.size(); i++) {
            if (map.get(arr[i]) == moreOccurrence) {
                set.add(arr[i]);
                }
            }
        Object[] modes = set.toArray();
        Arrays.sort(modes);
        System.out.println(modes[0]);
    }
}
