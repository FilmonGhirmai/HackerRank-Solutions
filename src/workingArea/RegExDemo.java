package workingArea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/18/17.
 * Software Developer
 */
public class RegExDemo {
    public static void main(String[] args) {
        String str = "abcdef";
        boolean b0 = Pattern.matches("a*b","ab");     //True.
        boolean b1 = Pattern.matches("a{4}b","aaab"); //False.
        //System.out.println(b0);
       // System.out.println(b1);

        String myRegExString = "[a-zA-Z\\s]+";
        String myString = "The quick brown fox jumped over the lazy dog";
        Pattern pattern = Pattern.compile(myRegExString);
        Matcher matcher = pattern.matcher(myString);
        if(matcher.find())
            System.out.println(matcher.group());

        System.out.println("*********");
        String s = "hello,Goodbye , farewell";
        Pattern p = Pattern.compile("\\p{Alpha}+");
        Matcher m = p.matcher(s);
        while(m.find())
            System.out.println(m.group());

    }
}
