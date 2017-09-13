package Thirty_Day_OF_Code;

import java.util.Scanner;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
// Day 15: Linked List

public class LinkedList{
    public static  Node2 insert(Node2 head,int data) {
        //Complete this method
        if(head == null){
            return new Node2(data);
        }
        if(head.next == null){
            head.next = new Node2(data);
        }
        else{
            insert(head.next,data);
        }
        return head;
    }

    public static void display(Node2 head) {
        Node2 start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node2 head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
