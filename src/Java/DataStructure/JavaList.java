package Java.DataStructure;

import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

public class JavaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        int n = in.nextInt();
        if(n >= 1 &&  n <= 4000){
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }

            int q = in.nextInt();
            if(q >= 1 && q<=40000){
                for (int i = 0; i < q; i++) {
                    String type = in.next();
                    if(type.equals("Insert")){
                        int index = in.nextInt();
                        int data  = in.nextInt();
                        list.add(index,data);
                    }
                    else if(type.equals("Delete")){
                        int index = in.nextInt();
                        list.remove(index);

                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i).toString());
            System.out.printf(" ");
        }
    }
}
