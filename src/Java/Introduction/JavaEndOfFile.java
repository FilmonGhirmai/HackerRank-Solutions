package Java.Introduction;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        int i=1;
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str = in.nextLine();
            if(!str.equals("")) {
                System.out.println(i + " " + str);
                i++;
            }else{
                System.exit(0);
            }
        }
    }
}
