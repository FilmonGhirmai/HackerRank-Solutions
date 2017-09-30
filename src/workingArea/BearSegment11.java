package workingArea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/7/17.
 * Software Developer
 */
public class BearSegment11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int t = in.nextInt();
        if(t < 1 || t > 10)
            System.exit(0);

        for (int i = 0; i < t; i++) {
            String str = in.next();
            if(str.length() < 1 || str.length() > 100000)
                System.exit(0);
            String[] st = str.split("0");
            for(String s : st){
                if(!s.equals(""))
                    list.add(s);
            }

            System.out.println(Arrays.asList(st));
            System.out.println(list.size());
            //check if the size of the list is equal to 1 or not
            //if list.size == 1 ,print Yes otherwise print No
            if(list.size() == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            //clear the list
            list.clear();
        }

    }

}
