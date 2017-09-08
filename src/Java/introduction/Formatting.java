package Java.introduction;
import java.util.Scanner;
/**
 * Created by skynet on 7/24/17.
 *
 */
public class Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%s\t%d",s1,x);
        }
        System.out.println();
        System.out.println("================================");
    }
}
