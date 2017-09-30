package workingArea;

import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 9/2/17.
 * Software Developer
 */
public class leapArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        if (1 <= q && q <= 5000) {
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();
                if ((0 <= leap && leap <= 100)) {
                    int[] game = new int[n];
                    for (int i = 0; i < n; i++) {
                        game[i] = scan.nextInt();
                    }

                    System.out.println((canWin(leap, game)) ? "YES" : "NO");
//                    System.out.println(leap);
//                    System.out.println(n);
//                    System.out.println(q);
                } else {
                    System.out.println("1 <= leap <= 100 && 2 <= n <=100");
                }
            }
        } else {
            System.out.println("1 <= q <= 5000");
        }
    }

    public static boolean canWin(int leap, int[] game) {
//        int forwardMove;
//        int backwardMove;
//        int leapMove;
//        int i = 0;
//        int len = game.length - 1;
//        boolean returnType = true;
//        while (i < len) {
//            if (((i + leap) >= len)) {
//                i = i + leap;
//                returnType = true;
//            } else if ((i + 1) >= len) {
//                i = i + 1;
//                returnType = true;
//            } else if (game[i + leap] == 0) {
//                i = i + leap;
//            } else if (game[i + 1] == 0) {
//                i++;
//            } else {
//                i = len;
//                returnType = false;
//            }
//        }
//        return returnType;
        boolean returnValue = false;
        int len = game.length - 1;
        for (int i = 0; i < leap; i++) {
            int j = i;
            while (j < len) {
                try {
                    if (game[j + leap] == 0) {
                        j = j + leap;
                        //returnValue = true;
                    } else {
                        returnValue = false;
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
//                    returnValue = true;
//                    break;
                    return true;
                }
            }
        }
        return returnValue;
    }

}
