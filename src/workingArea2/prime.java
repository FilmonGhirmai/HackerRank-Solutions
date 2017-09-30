package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
/* 4 program to find out whether a number is prime or not*/
public class prime {
    int counter = 0;
    private prime(){

    }

    private void PrimeTest(int a){
        for (int i = 1; i <= a; i++) {
            if(a%i == 0)
                counter++;
        }
    }
    private String isPrime(){
       if(counter == 2)
           return "Yes It is Prime";
       else
           return "No It not a Prime";
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number...");
        int p = sc.nextInt();
        prime pr = new prime();
        pr.PrimeTest(p);
        System.out.println(pr.isPrime());
    }
}
