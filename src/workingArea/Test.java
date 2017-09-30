package workingArea;

/**
 * Created by skynet on 7/21/17.
 *
 */

public class Test {
    public static void main(String args[] ) throws Exception {
        System.out.println("Integer numbers");
        System.out.printf("%d\n",26);
        System.out.printf("%d\n",-26);
        System.out.printf("%o\n",26);
        System.out.printf("%x\n",26);
        System.out.printf("%X\n",26);
        System.out.printf("%b\n",26);

        System.out.println("Floating point numbers");
        System.out.printf("%e\n",12345678.9);
        System.out.printf("%E\n",12345678.9);
        System.out.printf("%e\n",-12345678.9);
        System.out.printf("%f\n",12345678.9);
        System.out.printf("%g\n",12345678.9);
        System.out.printf("%G\n",12345678.9);
        System.out.printf("%a\n",12345678.9);
        System.out.printf("%A\n",12345678.9);

        System.out.println("**************");
        System.out.printf("%4s\n","1");
        System.out.printf("%4s\n","12");
        System.out.printf("%4s\n","123");
        System.out.printf("%4s\n","1234");


    }
}
