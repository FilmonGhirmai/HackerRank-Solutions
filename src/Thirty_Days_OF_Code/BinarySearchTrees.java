package Thirty_Days_OF_Code;

import java.util.Scanner;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 22: Binary Search Trees

public class BinarySearchTrees {

    public static int getHeight(Node root){
        //Write your code here
        int height_Left = 0;
        int height_Right = 0;
        //if the root is null
        if (root.left != null) {
            height_Left = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            height_Right = getHeight(root.right) + 1;
        }

        return (height_Left > height_Right ? height_Left : height_Right);

    }

    public static Node insert(Node root, int data){
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
