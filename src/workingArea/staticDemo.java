package workingArea;

/**
 * Created by skynet on 8/1/17.
 */
public class staticDemo {
    public staticDemo(){
        System.out.println("constructor...");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        staticDemo sd = new staticDemo();
    }
}
