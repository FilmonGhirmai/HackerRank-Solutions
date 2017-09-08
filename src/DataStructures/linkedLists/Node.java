package DataStructures.linkedLists;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by skynet on 7/21/17.\
 *
 */
//Print the Elements of a Linked List
  class Node<T> {
    T data;
    Node next;

    Node(T object){
        this(object,null);
    }

    public Node(T object, Node<T> node) {
        data = object;
        next = node;
    }
}
 class ListNode<T> {
      private  Node firstNode;
      private  Node lastNode;

      ListNode(){
          firstNode = lastNode = null;
      }
     void ReversePrint(Node head) {
        if (head != null) {
            ReversePrint(head.next);
            System.out.println(head.data);
        }
    }

     void print(Node head) {
        if (head != null) {
            System.out.println(head.data);
            print(head.next);
        }
    }

    Node Insert(Node head, int data) {
       if(head ==  null){
           return new Node(data);
       }
       if(head.next == null){
           head.next = new Node(data);
       }else{
           Insert(head,data);
       }
       return head;
   }

   public void insertAtBack(T insertItem){
          if(firstNode != null){
              lastNode = lastNode.next = new Node(insertItem);
          }else{
              firstNode = lastNode = new Node(insertItem);
          }
   }


    public static void main(String[] args) {
        ListNode<Integer> list = new ListNode<>();
        list.insertAtBack(1);
        list.insertAtBack(2);
        list.insertAtBack(3);
        list.print(list.firstNode);
    }
}
