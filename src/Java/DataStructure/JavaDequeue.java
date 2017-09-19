package Java.DataStructure;

import java.util.*;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

/** Program : Java Dequeue*/

public class JavaDequeue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int size = 0;   // hold the number of  unique elements in the sets;
        int n = in.nextInt();
        int m = in.nextInt();

        if(m < 0 || m > 100000 || n < 0 || n >100000) System.exit(0);
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if(input < 0 || input >10000000)System.exit(0);
            if (deque.size() == m) {
                deque.addLast(input);
                deque.pollFirst();
                set.addAll(deque);
                if(set.size() > size){
                    size = set.size();
                    set.clear();
                }
                set.clear();
            }
            else{
                deque.addLast(input);
                set.clear();
            }
        }
        set.addAll(deque);
        if(set.size() > size) size = set.size();
        System.out.println(size);
    }

}
