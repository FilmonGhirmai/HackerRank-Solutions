package workingArea2;

import java.util.Scanner;

/**
 * Author : Filmon Ghirmai
 * Github : github.com/filmonghirmai
 * HackerRank : hackerrank.com/skynet21
 */
public class DiscountDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the brand of your car? ");
        String carBrand = in.next();
        System.out.println();

        System.out.print("What is the original price ?");
        double originalPrice = in.nextDouble();
        System.out.println();

        System.out.print("Whate is the discount Percentage ? ");
        double dicountInPercentage = in.nextInt();
        double dicount = dicountInPercentage/100;  // discount in fraction.
        System.out.println("**********************************************************");

        /*printing the discounted price*/
        double dicountAmount = originalPrice * dicount ;
        double newPrice = originalPrice - dicountAmount ;
        System.out.println("For the car with brand " + carBrand + " the new price will be : " + newPrice + "Dhs");
    }
}
