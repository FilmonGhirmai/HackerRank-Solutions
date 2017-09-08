package Java.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by skynet on 7/30/17.
 *
 */
/**
* Sample Input

 4
 5 3
 0 0 0 0 0
 6 5
 0 0 0 1 1 1
 6 3
 0 0 1 1 1 0
 3 1
 0 1 0

 Sample Output
 YES
 YES
 NO
 NO
* */
public class Array1D {

    /** A function that make a leap/jump for in game cell ..
     * @param leap : int value that specify the jump number.
     * @param game : array of cell in the game .
     * */
    public static boolean leap(int idx ,int leap , int[] game ) {
        int gameSize = game.length;
        int givenleap = leap;
        //if you end up in a 0 cell after leap maka a leap again ... and so on ..

        /**
         * 1 make a leap , if the destination cell contain 0 and
         2 check if the destination is the last cell  or beyond last cell then return true;
         3 if the destination is 0 and not last cell or beyond last cell
         4 repeat step number 1 ..
         */
        int index = idx;
        while (index < gameSize) {
            if (game[index] == 0) {// if destination cell is 0.
                if (index < gameSize)
                    index = leap + index;
                else
                    return true;
            } else if (game[index] == 1) {
                if (index < gameSize) {
                    index = leap - index;
                    if (game[index + 1] == 0)
                        index++;
                    else if (game[index - 1] == 0)
                        index--;
                    else return false;
                } else {  // if index is >= gameSize.
                    return true;
                }
            }
        } // end the leap function
        return false;
    }

    /** A function that walk forward in the game cell.
     * @param  index : integer value that specify the next initial position
     * @param  game  : array of cells in the game .
     * */
    public static boolean walkForward(int index , int[] game ) {

   return false;

    }

    /** A function that walk backward in the game cell.
     * @param  index : integer value that specify the next initial position
     * @param  game  : array of cells in the game .
     * */
    public static boolean walkBackward(int index , int[] game ) {

     return  false;

    }



    public static boolean canWin(int leap, int[] game) {
        int gameSize = game.length  ;
        String str = Arrays.toString(game);
        if (!str.contains("1")) {
            return true;
        } else if (leap >= gameSize) {
            return true;
        } else if (!str.contains("0") && leap < gameSize) {
            return false;
        } else if (leap == 0 && game[gameSize-1] == 1 ) {
            return false;
        } else {
            System.out.println("calling leap func");
            for (int i = 0; i <= gameSize - 1 ; i++) {
                if (leap(i,leap, game)) {
                    return true;
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        // check q condition
        if (q < 1 || q > 5000) {
            System.exit(0);

        }
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        

        scan.close();
    }
}
