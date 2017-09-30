package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
public class ReversOfDigit {
    int n ;
    String s = "";
    public String  Revers(int x){
        n = x;
        while (n % 10 !=0 ){
            s = s + (n % 10);
            n = n /10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to revers it");
        int sd = sc.nextInt();
        ReversOfDigit d = new ReversOfDigit();
        System.out.println(d.Revers(sd));

    }
}
