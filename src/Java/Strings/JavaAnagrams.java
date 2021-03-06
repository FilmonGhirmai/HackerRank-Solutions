package Java.Strings;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // a and b should be only english alphabets.
        if(!a.matches("[a-zA-Z]+") || !b.matches("[a-zA-Z]+"))
            System.exit(0);

        //Program constraints
        if(a.length() < 1 ||  a.length() > 50 || b.length() < 1 || b.length() > 50)
            System.exit(0);

        // if a and b are having different size they are not JavaAnagrams.
        if(a.length() != b.length()){
            return false;
        }
        else{  //convert a and b to character array and sort them , then check the two array.
                char[] aa = a.toLowerCase().toCharArray();
                char[] bb = b.toLowerCase().toCharArray();
                Arrays.sort(aa);
                Arrays.sort(bb);
                return Arrays.equals(aa,bb);
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        scan.close();
    }
}
