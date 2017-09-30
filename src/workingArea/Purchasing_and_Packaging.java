package workingArea;

import java.util.Scanner;

// class Purchasing and Packaging.
public class Purchasing_and_Packaging {

    //Entry point of this program
    public static void main(String[] args) {

     //we create a Scanner object so that we will get user data
     Scanner in = new Scanner(System.in);

     System.out.print("How many pencils did you buy? ");
     int numberOfPencils = in.nextInt();

     //Assuming pencil price is integer value.
     System.out.print("What is the price of each pencil? ");
     int priceOfPencil = in.nextInt();
     System.out.println();

     /*will calculate and print the total price for the pencil*/
     int pencilInitialTotalCost = numberOfPencils * priceOfPencil;
     System.out.println("The pencils total cost is : " + pencilInitialTotalCost + " Dhs" );
     System.out.println("*****************************************************************************************");
     System.out.println(); // just to give a new line .

     /*Packaging the Pencil and printing the total packages to be sold*/
     System.out.print("How many pencils do you want to put inside each package? ");
     int pencilsPerPackage = in.nextInt();
     int packages = numberOfPencils / pencilsPerPackage;
     int remainedPencils = numberOfPencils % pencilsPerPackage;
     System.out.println("You can make " + packages + " packages and " + remainedPencils + " pencils will remain");
     System.out.println();

     /*Calculating the selling price of each package*/
     System.out.print("What is the selling price of a package? ");
     int pricePerPackage = in.nextInt();
     int totalSoldPrice = packages * pricePerPackage;
     System.out.println("You will sell all the packages for (" +  packages +"*"+ pricePerPackage + ") = " + totalSoldPrice + " Dhs");
     System.out.println();
     System.out.println("****************************************************************************************");
     System.out.println(); // just to give a new line

     /*Calculating the profit and displaying the profit*/
     int profit = totalSoldPrice - pencilInitialTotalCost;
     System.out.println("Profit = " + totalSoldPrice + "-" + pencilInitialTotalCost + " = " + profit);

    } // end of main method

} // end of class
