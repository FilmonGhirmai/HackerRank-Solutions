package Thirty_Days_OF_Code;

import java.util.Queue;
import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
// Day 23: BST Level-Order Traversal

public class BSTLevelOrderTraversal {

    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> queue = (Queue<Node>) new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            System.out.print(current.data+" ");

            if (current.left!=null)
                queue.add(current.left);

            if (current.right!=null)
                queue.add(current.right);
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root = null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
