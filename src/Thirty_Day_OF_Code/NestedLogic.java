package Thirty_Day_OF_Code;

import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/16/17.
 * Software Developer
 */
public class NestedLogic {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int fine = 0 ;
        //Read the return date.
        int dateReturned  = in.nextInt();
        int monthReturned = in.nextInt();
        int yearReturned  = in.nextInt();

        //Read the expected date of the book to return.
        int dateExpected  = in.nextInt();
        int monthExpected = in.nextInt();
        int yearExpected  = in.nextInt();

        //check the input constraints for the return date;
        if(dateReturned < 1 || dateReturned > 31 || monthReturned < 1 || monthReturned > 12
                || yearReturned < 1 || yearReturned > 3000 )
            System.exit(0);

        //check the input constraints for the expected return date;
        if(dateExpected < 1 || dateExpected > 31 || monthExpected < 1 || monthExpected > 12
                || yearExpected < 1 || yearExpected > 3000 )
            System.exit(0);

       if(yearReturned < yearExpected){
           fine = 0;
       }else if(yearReturned > yearExpected){
           fine = 10000;
       }else{
           if(monthReturned > monthExpected){
             int   monthPassed = monthReturned - monthExpected;
             fine = 500 * monthPassed;
           }else{
               if(dateReturned > dateExpected){
                   int dayPassed = dateReturned - dateExpected;
                   fine = 15 * dayPassed;
               }else{
                   fine = 0;
               }
           }
       }

        System.out.println(fine);

    }
}
