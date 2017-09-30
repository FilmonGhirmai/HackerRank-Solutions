package workingArea;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by skynet on 8/2/17.
 *
 */
public class beautifulArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int t = in.nextInt();

        if(t < 1 || t  >1000000 ){
            System.exit(0);
        }

        for (int i = 0; i < t; i++) {
            boolean flag = false;
            int n = in.nextInt();

            if(n<1 || n >100000)
                System.exit(0);

            for (int j = 0; j < n; j++) {
                list.add(in.nextInt());
            }

            for (int j = 0; j < list.size(); j++) {
                for (int k = i+1; k <= list.size(); k++) {
                   int mul =  list.get(i) * list.get(j);
                   if(list.contains(mul))
                     flag = true;
                }
            }
            if(flag) {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            list.clear();
        }


    }
}
