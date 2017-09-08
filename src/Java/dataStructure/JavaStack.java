package Java.dataStructure;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/27/17.
 * Software Developer
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


    /**
     *
     * import java.io.*;
     import java.util.*;
     import java.text.*;
     import java.math.*;
     import java.util.regex.*;

     public class Solution {

     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     while(scanner.hasNextLine()) {
     Stack<Character> stack = new Stack<>();
     String line = scanner.nextLine();
     for(char c : line.toCharArray()) {
     if(c == '{' || c == '(' || c == '[') {
     stack.push(c);
     continue;
     }

     if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
     stack.pop();
     continue;
     }

     if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
     stack.pop();
     continue;
     }

     if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
     stack.pop();
     continue;
     }

     if(c == '}' || c == ')' || c == ']') {
     stack.push(c);
     break;
     }
     }
     System.out.println(stack.isEmpty());
     }
     }
     }
     Solution 2:
     import java.io.*;
     import java.util.*;
     import java.text.*;
     import java.math.*;
     import java.util.regex.*;
     class Parser{
     private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
     static {
     brackets.put('[', ']');
     brackets.put('{', '}');
     brackets.put('(', ')');
     }


     boolean checkParenthesesBalance(String str){
     final Stack<Character> stack = new Stack<Character>();
     for (int i = 0; i < str.length(); i++) {
     if (brackets.containsKey(str.charAt(i))) {
     stack.push(str.charAt(i));
     } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
     return false;
     }
     }
     return stack.empty();
     }
     }
     class Solution{

     public static void main(String []argh){
     Parser X=new Parser();
     Scanner in = new Scanner(System.in);

     while (in.hasNext()) {
     System.out.println(X.checkParenthesesBalance(in.next()));
     }

     }
     }
    *
    * */

}
