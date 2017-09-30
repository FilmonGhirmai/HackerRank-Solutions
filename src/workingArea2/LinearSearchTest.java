package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 7/14/17.
 *
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int searchKey;
        int position;
        //create array and output it
        LinearArray searchArray = new LinearArray(100);
        System.out.println(searchArray.output() + "\n");

        //Get input from the user
        System.out.println("Enter a number between 10 and 99(-1 to quit)");
        searchKey = scanner.nextInt();

        while (searchKey != -1){
            //fined the element position
            position = searchArray.linearSearch(searchKey);
            if(position != -1){
                System.out.println("The integer " + searchKey + " is found at : " + position);
            }else{
                System.out.println("The integer " + searchKey + " is not found");
            }

            // get input from the user
            System.out.println("Enter another search key....");
            System.out.println("The number  " + searchKey + " occurs " + searchArray.howManyTimes(searchKey) + " time in the array");
            searchKey = scanner.nextInt();

        }

    }
}
