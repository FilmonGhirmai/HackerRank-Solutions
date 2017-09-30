package workingArea;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/9/17.
 * Software Developer
 */
/*public class Node {
    int data;
    Node next;
}

class NodeDemo {
    public workingArea2.Node insert(workingArea2.Node head, int data) {
        if (head == null) {
            head = new workingArea2.Node();
            head.data = data;
            head.next = null;
            return head;
        }
        if (head.next == null) {
            workingArea2.Node node = new workingArea2.Node();
            node.data = data;
            node.next = null;
            head.next = node;
        } else {
            insert(head.next, data);
        }
        return head;
    }

    public static void print(workingArea2.Node head) {
        if (head != null) {
            System.out.print(head.data);
            System.out.printf(" ");
            print(head.next);
        }
    }


    public workingArea2.Node insertAtHead(workingArea2.Node head, int data) {
        workingArea2.Node node;
        if (head != null) {
            node = new workingArea2.Node();
            node.data = data;
            node.next = head;
            return node;
        } else {
            node = new workingArea2.Node();
            node.data = data;
            node.next = null;
            return node;
        }

    }
    public workingArea2.Node insertAtPosition(workingArea2.Node head, int data, int pos){
        workingArea2.Node node ;
        workingArea2.Node firstNode;
        if(head != null){
            // firstNode node that hold the original head;
             firstNode = head;
            for (int i = 0; i < pos -1; i++) {
               head = head.next;
            }

            node = new workingArea2.Node();
            node.data = data;
            node.next = head.next;
            head.next = node;
            return firstNode;
        }else{
            node = new workingArea2.Node();
            node.data = data;
            node.next = null;
            return node;
        }
    }

    public workingArea2.Node removeFromFront(workingArea2.Node head){
        workingArea2.Node newHead = null ;
        if(head != null ) {
            newHead = head.next;
            head.next = null;
        }
        return newHead;
    }
    public workingArea2.Node removeFromBack(workingArea2.Node head){
        return  null;
    }

    public workingArea2.Node removeFromPosition(workingArea2.Node head, int pos){
        workingArea2.Node firstNode;
        workingArea2.Node targetNode;
        if(head != null){
            firstNode = head;
            for (int i = 0; i < pos-2; i++) {
                head = head.next;
            }
            targetNode = head.next ;
            firstNode.next = targetNode.next;
             return  firstNode;
        }else{
            firstNode = null;
            return  firstNode;
        }

    }

    public static void  Merge(workingArea2.Node head1 , workingArea2.Node head2) {
        if (head1.next == null){
            head1.next = head2;
        }
        else
         Merge(head1.next, head2);
    }
    public static workingArea2.Node removeDuplicates(workingArea2.Node head){
        workingArea2.Node current = head;
        while (head != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        workingArea2.Node head = null;
        workingArea2.NodeDemo n = new workingArea2.NodeDemo();
        head = n.insert(head, 5);
        head = n.insert(head, 6);
        head = n.insert(head, 7);
        head = n.insert(head, 8);
        System.out.println("\nFirst linked list content...");
        System.out.println("\nPrinting the data....");
        print(head);
        System.out.println("\ninsert at head....9");
        head = n.insertAtHead(head, 9);
        print(head);

        System.out.println("\ninsert at the tail ..44");
        head = n.insert(head, 44);
        print(head);
        System.out.println("\nremoving from the head ...");
        head = n.removeFromFront(head);
        System.out.println("\nThe list becomes ...");
        print(head);
        System.out.println("\ninserting 99 at position 3...");


        workingArea2.Node head2 = null;
        workingArea2.NodeDemo n2 = new workingArea2.NodeDemo();
        head2  = n2.insert(head2,80 );
        head2  = n2.insert(head2,90);
        head2 =  n2.insert(head2,90);
        System.out.println("\nSecond Linkedlist content....");
        print(head2);

        System.out.println("\nMerging first linkedlist and second linkedlist....");
        workingArea2.NodeDemo.Merge(head,head2);
        print(head);

        System.out.println("\nremoving duplicates...");
        head = removeDuplicates(head);
        print(head);
    }*/

