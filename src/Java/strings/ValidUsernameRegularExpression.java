package Java.strings;

import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/22/17.
 * Software Developer
 */

class UsernameValidator{
    public static final String regularExpression = "[a-zA-Z][a-zA-Z_0-9]{7,29}";
}
public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
