package Thirty_Day_OF_Code;
import java.util.Scanner;
/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/4/17.
 * Software Developer
 */

//workingArea.Node class contain data and next field ,for the node data and next node reference.
class Node {
 // will store the node data
 int data;
 //will store the next node reference;
 Node next;

   //Constructor that creates a new node;
   Node(int d) {
            data = d;
            next = null;
        }
  }
//Class NodeDemo that contain multiple methods
class NodeDemo {

    static Node previousNode = null;

    //static method that insert a new node at the tail of the linkedlist,it accept node and data;
    public static  Node insert(Node head,int data) {
       //if the head if null , true first time only, linkedlist is empty;
       // so instanite a new node and assign to the head object and return it.
       if(head == null){
           head = new Node(data);
           return  head;
       }
       //head if not null and head.next is null ,
       // means the linkedlist contain only one node
       if(head.next == null){
           head.next = new Node(data);
       }
       //The linkedlist contain morethan one node,
       // so move by one at a time by head.next ,which gives the next node;
       else{
           insert(head.next,data);
       }
       return head;
    }
    public static void insertAtSpecificlocaltion(Node head,int data){

    }

    public static void insertAtHead(Node head,int data){
        Node temp;
        if(head != null){
            temp = head.next;
            Node newNode = new Node(data);
            newNode.next = temp;
            head.next =  newNode;
        }
    }

    public static Node removeFromBack(Node head){
        if (head != null) {
            head.next = null;
            removeFromBack(head.next);
        }
        return head;
    }
    private static void printInReverse(Node head) {
        if(head != null){
            printInReverse(head.next);
            System.out.print(head.data + " ");
        }
    }

    public static Node removeFromFront(Node head){
        Node newHead = null ;
        if(head != null ) {
            newHead = head.next;
            head.next = null;
        }
        return newHead;
    }
    //static method that display linkedlist content , accept head of the linkedlist ;
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    public static void merge(Node head1 , Node head2){

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        // printing the list
        System.out.println("\nPrinting the list....");
        display(head);
        //print int revers
        System.out.println("\nprinting the list in reverse....");
        printInReverse(head);

        insertAtHead(head,10);
        System.out.println("\nnew node is added at the head....10");
        display(head);

        //remove from the head;
        head = removeFromFront(head);
        System.out.println("\nAfter removing from head....");
        display(head);

        System.out.println("\nremoving the last node ...");
        head = removeFromBack(head);
        display(head);

        sc.close();
    }


}