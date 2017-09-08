package Thirty_Day_OF_Code;
import java.util.Scanner;
public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int longestSequence = 0;
        if(n >=1 && n <=1000000){
            String  bin = Integer.toBinaryString(n);
             String[] allOnce = bin.split("0");
            for (int i = 0; i < allOnce.length; i++) {
                if(allOnce[i].length() > longestSequence){
                    longestSequence = allOnce[i].length();
                }
            }
        }
        System.out.println(longestSequence);

    }

    /* public static  int  findAllSeq(int st) {
         int start = st;
         ArrayList<Integer> list = new ArrayList<>();
         if (counter < bin.length()) {
             if (bin.charAt(start) == '1') {
                 if(bin.substring(start, bin.indexOf('0')).isEmpty()){

                 }
                 String subString = bin.substring(start, bin.indexOf('0'));
                 start = bin.indexOf('0');
                 list.add(subString.length());
                 counter = start;
                 return  findAllSeq(start);
             } else {
                 String subString = bin.substring(start ,bin.indexOf('1'));
                 start = bin.indexOf('1',start);
                 counter = start;
                 return  findAllSeq(start);
             }
         }

         else {
             workingArea.Collections.sort(list, Comparator.reverseOrder());
             return  list.get(0);

         }
     }*/


}
