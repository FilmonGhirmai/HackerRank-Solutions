package Thirty_Day_OF_Code;

import java.util.Scanner;

//Day 19: Interfaces

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class calculator implements AdvancedArithmetic {
    int sum = 0;
    public int divisorSum(int n ){
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0)
                sum = sum + i;
        }
        return sum;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

