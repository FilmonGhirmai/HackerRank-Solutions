package Java.strings;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException pe){
                System.out.println("Invalid");
            }

        }
    }
}
