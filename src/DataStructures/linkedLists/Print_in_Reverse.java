package DataStructures.linkedLists;

import java.util.*;

/**
 * Created by skynet on 7/21/17.
 */
//Print in Reverse
public class Print_in_Reverse {
    static void ReversePrint(List list) {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // with argument
        list.add(1);list.add(2);list.add(3);

        ReversePrint(list);
    }
}
