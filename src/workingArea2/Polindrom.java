package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
public class Polindrom {
    private int n;
    private String rev = "" ;
    private int i = 0 ;
    private String originalString;

    private void isPolindrom(String str) {
        this.n = str.length();
        this.originalString = str;
        while (i < n){
            rev = str.charAt(i) + rev ;
            i++;
        }

        System.out.println("string lenght is : " + n);
        System.out.println("Original string is : " + this.originalString);
        System.out.println("Reveres of the string is : " + this.rev);
        if(rev.equalsIgnoreCase(this.originalString))
            System.out.println("String->" + this.originalString + " is Polindrom");
        else
            System.out.println("String->" + this.originalString + " is Not Polindorm");

       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string...");
        String str = sc.next();

        Polindrom p = new Polindrom();
                  p.isPolindrom(str);
    }

}
