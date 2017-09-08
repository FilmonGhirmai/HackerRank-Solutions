package DataStructures.linkedLists;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by skynet on 7/21/17.
 */
//
//Insert a node at a specific position in a linked list
public class Insert_At_Spc_Posistion {
    static Object InsertNth(LinkedList list, int data,int Position){
        //insert in head
        list.add(Position,data);
        return list.peekFirst();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);list.add(2);list.add(3);
        System.out.println(list);

        System.out.println(InsertNth(list,4,0));
        System.out.println(list);
    }
}
