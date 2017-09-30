package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
public class factorial {

    double fact = 1;
    public double getFactorial(double d ){
        for (int i = 1; i <= d; i++) {
         fact = fact * i ;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial...");
        double dd = sc.nextInt();
        factorial f = new factorial();
        System.out.println("The factorial of " + dd + " is " + f.getFactorial(dd));
    }
}
