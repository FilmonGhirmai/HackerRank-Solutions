package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
public class SumOfDigit {
    int n;
    int r;
    int sum = 0 ;
    public int sumOfDigit(int n){
        while(n % 10 != 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter a Number...");
        int num = sc.nextInt();
        SumOfDigit s = new SumOfDigit();
        System.out.println(s.sumOfDigit(num));
    }
}
