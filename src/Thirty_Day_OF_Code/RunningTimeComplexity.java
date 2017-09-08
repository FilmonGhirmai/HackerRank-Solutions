package Thirty_Day_OF_Code;

import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/14/17.
 * Software Developer
 *
 */
public class RunningTimeComplexity {

    // this function will perform the task in f(n) = n which is O(n)
    public static String isPrime1(int num){
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0)
                counter++;
        }
        if(counter == 2)
            return  "Prime";
        else
            return  "Not prime";
    }

    //This function will determine it in 5 or less than steps
    public static String isPrime2(int num){
        if(num == 1)
            return "Not prime";
        else if(num == 2 || num == 3)
            return "Prime";
        else if (num % 2 == 0){
            return "Not prime";
        }else {
            if(num % 3 == 0 && num % 2 !=0)
                return "Not prime";
            else
               return "Prime";
        }
    }

    //A function that determine the prime or not in less than 3 steps f(n) = squr(n);
    public static String isPrime3(int num){
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
            long start = System.currentTimeMillis();

            String result = isPrime3(n);
            System.out.println(result);
            long end = System.currentTimeMillis();

            //System.out.println(result);
            System.out.println("Time : " + (end - start) + "ms");
        }

    }
}
