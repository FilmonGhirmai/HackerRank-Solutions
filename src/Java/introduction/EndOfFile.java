package Java.introduction;

import java.util.Scanner;

/**
 * Created by skynet on 7/24/17.
 */
public class EndOfFile {
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
