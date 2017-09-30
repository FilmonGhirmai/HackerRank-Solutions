package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 *
 */
public class Solution {
    String str ;
    String[] str_split;
    private int getSumOfArray(CharSequence arr){
           return (this.getSum(arr));
    }

    public int getSum(CharSequence a){
        int sum = 0 ;
        str = a.toString();
        str_split = str.split(" ");

        for (int i = 0; i < str_split.length; i++) {
            sum = sum + Integer.parseInt(str_split[i]);
        }
        return sum;
    }


    public String displayTheNumbers(){
        String s = "";
        for (int i = 0; i < str_split.length; i++) {
           s = s + str_split[i] + " ";
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements separated  by space");
        // 1 2 3
        CharSequence s = sc.nextLine();

        Solution solution = new Solution();
        System.out.println("The sum of the array numbers is ... " + solution.getSumOfArray(s));
        System.out.println("The numbers are ... " + solution.displayTheNumbers());
    }
}
