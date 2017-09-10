package Thirty_Day_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

public class RunningTimeComplexity {

    public static String isPrime(int num){
        int halfNum = num/2;
        int root = (int) Math.sqrt(num);
        if(num == 1 )
            return "Not prime";
        for (int i = 2; i <= root; i++) {
            if(num % i == 0){
                return "Not prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        if(t < 1 || t > 30 )
             System.exit(0);

        for (int i = 0; i < t; i++){
            int n = in.nextInt();
            if(n < 1 || n > 2000000000)
                System.exit(0);

            String result = isPrime(n);
            System.out.println(result);
        }

    }
}
