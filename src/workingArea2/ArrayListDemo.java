import java.util.ArrayList;
import java.util.List;

/**
 * Created by skynet on 5/22/17.
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();

        //adding items into the "List : list"
        list.add("php");
        list.add("java");
        list.add("git");
        list.add("git");
        //printing the list items
        for(String value : list){
            System.out.println(value);
        }
        System.out.println("------------");
        // removing an item from the llist
        list.remove(0);
        for(String value : list){
            System.out.println(value);
        }

        // get element out of the list
        System.out.println("at zero location " + list.get(0));

        //trimToSize
        System.out.println("origina size " + list.size());
        System.out.println("after trimtosize: " + list.size());

    }
}
