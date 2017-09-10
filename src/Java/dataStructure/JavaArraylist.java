package Java.dataStructure;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.ArrayList;
import java.util.Scanner;


public class JavaArraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> line ;

        //check t to  the given condition .
        if( t < 1 || t > 20000)System.exit(0);
        for (int i = 0; i < t ; i++) {
            line = new ArrayList<>();
            int n = in.nextInt();
            if(n < 0 || n > 50000)
                System.exit(0);
            for (int j = 0; j < n; j++) {
                line.add(in.nextInt());
            }

            // Add the lines to the list
            list.add(line);
        }
        System.out.println(list);
    int q = in.nextInt();
    if(q < 1 || q > 1000)System.exit(0);
     for (int k = 0; k < q ; k++) {
            int currentLine = in.nextInt();
            int valueAt     = in.nextInt();
            if( currentLine < 1 || currentLine > t)System.exit(0);
            try {
                System.out.println(list.get(currentLine -1).get(valueAt-1));
            }
            catch (Exception e){
                //e.printStackTrace();
                System.out.println("ERROR!");
            }
        }

    }
}
