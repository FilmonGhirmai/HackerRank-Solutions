package Java.strings;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

class MyRegex {
    String pattern = "((([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))(\\.|$)){4}";
}

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
