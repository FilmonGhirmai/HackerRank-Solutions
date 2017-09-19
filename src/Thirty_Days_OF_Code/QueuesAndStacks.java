package Thirty_Days_OF_Code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 18: Queues and Stacks

 class Solution {
    Stack<Character> stack;
    Queue<Character> queue;

    Solution() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public Character popCharacter() {
        return stack.pop();
    }

    public Character dequeueCharacter() {
        return queue.remove();
    }

    // Main method is given as a locked stab.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
