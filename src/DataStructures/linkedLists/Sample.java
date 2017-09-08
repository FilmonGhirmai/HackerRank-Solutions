package DataStructures.linkedLists;

import java.util.*;

/**
 * Created by skynet on 7/20/17.
 */
public class Sample {
    public static void main(String[] args) {
        // add colors elements to list1
        String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        List<String> list1 = new ArrayList<>(Arrays.asList(colors));
        List<String> list = new LinkedList<>();
        for(String suit : suits)
        list.add(suit);
        Collections.sort(list,Collections.reverseOrder());
        Collections.sort(list1);
        //*printing using Iterator
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.printf("%s " , iterator.next());
        }
        System.out.println("\n");
        System.out.println(list1);
        int result = Collections.binarySearch(list1,"yellow");
        if(result >= 0)
            System.out.println("found at " + result);
        else
        System.out.println("not found");

        LinkedList<String> elist = new LinkedList<>(Arrays.asList(suits));
        System.out.println("calling print method");
        print(elist);

        System.out.println("calling insert ");
        System.out.println(insert(elist,"filmon"));
        System.out.println(elist);

        //get list content as an array
        String[] asArray = elist.toArray(new String[elist.size()]);

        System.out.println("printing after converet the linked list to array");
        System.out.println(Arrays.toString(asArray));

    }

   static void print(LinkedList list){
        if(!list.isEmpty()){
            ListIterator iterator = list.listIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }

    }
    static  String  insert(LinkedList list,String data){
       list.addFirst(data);

       return  list.peekFirst().toString();
    }

}
