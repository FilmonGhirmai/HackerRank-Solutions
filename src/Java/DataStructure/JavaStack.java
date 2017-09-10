package Java.DataStructure;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        while (in.hasNext()){
            String str = in.next();
            System.out.println(isBalances(str,map) ? "true" : "false");
        }
        in.close();
    }

    private static boolean isBalances(String exp , HashMap<Character,Character> map){
        //check if the input string length is odd or not
        if(exp.length() % 2 !=0){
            return false;
        }
        //if even number of characters in the input string ...
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < exp.length(); i++) {
            Character c = exp.charAt(i);
            if(map.containsKey(c)){
                deque.push(c);
            }else if(deque.isEmpty() || c != map.get(deque.pop())){
                return  false;
            }
        }
        return deque.isEmpty();
    }

}
