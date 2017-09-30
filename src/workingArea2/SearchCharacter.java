package workingArea2;

import java.util.Scanner;


public class SearchCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String....");
        String str = sc.next();

        System.out.println("Enter the character to search in the given string " + str.toString());
        char c = sc.next().charAt(0);

        if(str.indexOf(c) != -1)
            System.out.println("Yes " + c + " is at the location of " + str.indexOf(c));
        else
            System.out.println("No " + c + " is not found the string " + str.toString() );
    }
}
