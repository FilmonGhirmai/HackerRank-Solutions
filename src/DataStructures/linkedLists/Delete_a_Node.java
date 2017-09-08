package DataStructures.linkedLists;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by skynet on 7/21/17.
 */
//Delete a Node
public class Delete_a_Node {
    static Object  Delete(LinkedList list, int position){
        if(position >= list.size())
            System.exit(0);
        //remove the node at position
        list.remove(position);
        return list.peekFirst();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);list.add(2);list.add(3);
        System.out.println(list);

        System.out.println(Delete(list,2));
        System.out.println(list);
    }
}
