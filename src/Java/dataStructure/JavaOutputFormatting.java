package Java.dataStructure;

import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/26/17.
 * Software Developer
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            String st ;
            int maxlenght = 18;
            int spaceGap = 0;
            if(s1.length() > 10 || x < 0 || x > 999)
                System.exit(0);
            //Complete this line
            spaceGap = maxlenght - s1.length();
            if(x <= 9){  // add 2 leading zero's
                st = "00" + x;
                System.out.printf("%s" + "%" + spaceGap + "s" + "\n",s1,st);
            }else if(x >= 10 && x <= 99){  // add 1 leading zero's.
                st = "0" + x ;
                System.out.printf("%s" + "%" + spaceGap + "s" + "\n",s1,st);
            }else{  // x is three digit do nothing with that.
                System.out.printf("%s" + "%" + spaceGap + "s" + "\n",s1,x);
            }



        }
        System.out.println("================================");


    }
}