package Java.introduction;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

public class StaticInitializer {
    static boolean flag;
    /* This block will execute first */
 static {
  flag = true;
 }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int B = in.nextInt();
        int H = in.nextInt();

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}

