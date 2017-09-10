package DataStructures.Arrays;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;
public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] list  = null ;
        int n = in.nextInt();
        int m = in.nextInt();
        int a,b,k;
        int max = 0;
        if(n < 3 || n > 10000000 || m < 1 || m > 200000){
            System.exit(0);
        }else{
            list = new int[n];
            for (int i = 0; i < m; i++) {
                //continue to get a,b and k
                a = in.nextInt();
                b = in.nextInt();
                k = in.nextInt();
                //now check if the input values a, b and k meet the constraints
                if (a < 1 || a > b || b > n || k < 0 || k > 1000000000) {
                    System.exit(0);
                }else {
                    for (int j = a; j <=b ; j++) {
                        list[j-1] = list[j-1]+ k;
                        if(list[j-1] > max)
                            max = list[j-1];

                    }
                }
            }
        }
        System.out.println(max);
    }
}
