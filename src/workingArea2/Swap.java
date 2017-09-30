package workingArea2;

/**
 * Created by skynet on 4/28/17.
 */
public class Swap {
    public static void main(String[] args) {
        String son = "Filmon";
        String father = "Ghirmai";

        System.out.println("Printing before swap...");
        System.out.println("son: " + son);
        System.out.println("father: " + father);

        //swap
        son = son + father ;  // a is now a = "filmonghirmai"
        father = son.substring(0,son.length() - father.length()); //will get the string Filmon from filmonghirmai.

        son = son.substring(father.length());
        //after swap
        System.out.println("son: " + son);
        System.out.println("father :" + father);
    }
}
