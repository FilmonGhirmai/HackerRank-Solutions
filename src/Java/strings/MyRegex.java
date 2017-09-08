package Java.strings;
import java.util.Scanner;
/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/21/17.
 * Software Developer
 */
class MyRegex {
    // 12.12.9.122
    //String pattern = "(([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))\\.(([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))\\.(([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))\\.(([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))";
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
