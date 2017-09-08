package DataStructures.linkedLists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by skynet on 7/21/17.
 */
//Reverse a linked list
public class Reverse_LinkedList {
    static void Reverse(List list) {
        if (!list.isEmpty()){
            Collections.reverse(list);
            ListIterator iterator = list.listIterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }else{
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // with argument
        list.add(1);list.add(2);list.add(3);
        Reverse(list);
    }
}
