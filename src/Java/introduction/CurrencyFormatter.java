package Java.introduction;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by skynet on 8/2/17.
 * US: $12,324.13
 India: Rs.12,324.13
 China: ￥12,324.13
 France: 12 324,13 €
 *
 *
 */
public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us    = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.PRC);
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Write your code here.

        System.out.println("US: "    + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: "+ france.format(payment));

    }
}
