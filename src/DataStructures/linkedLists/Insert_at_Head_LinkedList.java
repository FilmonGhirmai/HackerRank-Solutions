package DataStructures.linkedLists;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by skynet on 7/21/17.
 */
public class Insert_at_Head_LinkedList {
        static Object Insert(LinkedList list, int data){
            //insert in head
            list.addFirst(data);
            return list.peekFirst();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            LinkedList<Integer> list = new LinkedList<>();

            list.add(1);list.add(2);

            System.out.println(Insert(list,3));
            System.out.println(list);
        }
}

