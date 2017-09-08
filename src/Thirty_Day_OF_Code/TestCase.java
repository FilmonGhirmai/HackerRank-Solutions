package Thirty_Day_OF_Code;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/16/17.
 * Software Developer
 */
//class that print test cases...for a progamm.
public class TestCase {
    public static void main(String[] args) {

        // Number of lectures.
        System.out.println("5");

        // workingArea.Test Case: 1
        // Expected output : YES
        System.out.println("8 3");
        System.out.println("0 1 -1 3 2 3 5 8");

        // workingArea.Test Case: 2
        // Expected output : NO
        System.out.println("7 4");
        System.out.println("1 2 -2 -1 -3 2 0");

        // workingArea.Test Case: 3
        // Expected Output : YES
        System.out.println("6 3");
        System.out.println("0 3 2 -1 5 4");

        // workingArea.Test Case: 4
        // Expected output : NO
        System.out.println("5 2");
        System.out.println("1 2 3 0 -1");

        // workingArea.Test Case: 5
        // Expected output : YES
        System.out.println("9 5");
        int a5[] = { 1, 2, 0,-1 ,7 ,4 ,3 ,6 ,-3 };
        for(int a : a5)
            System.out.print(a + " ");
        //System.out.println("1 2 0 -1 7 4 3 6 -3");

    }
}
