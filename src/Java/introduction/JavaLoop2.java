package Java.introduction;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;
public class JavaLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        //check input constraints ....
        if(t < 0 || t > 500)
            System.exit(0);

        for(int i = 0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // check a and b for allowed constraints...
            if(a < 0 || a > 50 || b < 0 || b > 50  || n < 1 || n > 15)
                System.exit(0);
            int result = 0;
            for (int j = 0; j < n; j++) {
                if(j == 0 ){
                  result = ((a) + ((int)Math.pow(b,j) * b));
                }
                else{
                    result = result + ((int)Math.pow(2,j) * b);
                }
                System.out.print(result + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
