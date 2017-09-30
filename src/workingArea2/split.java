package workingArea2;

/**
 * Created by skynet on 7/11/17.
 */
public class split {
    public static void main(String[] args) {
        String str = "hello;there;how;are;you";
        String [] s = str.split(";");
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
    }
}
