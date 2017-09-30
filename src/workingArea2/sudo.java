package workingArea2;

import java.util.*;

/**
 * Created by skynet on 6/13/17.
 */
public class sudo {


    public static void main(String[] args) {
        String[] numbers = {"one","two","three","one","seven","two"};
        List<String> list = Arrays.asList(numbers);
        System.out.printf("List : %s\n",list);
        printNoD(list);

Random r = new Random();
        System.out.println("_________________");
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(9) + 1);
        }
    }

    private static void printNoD(Collection<String> values) {
        Set<String> set = new HashSet<>(values);
        System.out.println("Unique");
        for (String value : set){
            System.out.printf("%s",value);
            System.out.println();
            System.out.print("id");
        }


        Set<Integer> se = new HashSet<>();
        se.add(1);
        se.add(2);
        se.add(3);
        if(se.add(3)) {
            System.out.println("added");
        }else{
            System.out.println("not added");
        }
        System.out.println("Print the hashset...");
        System.out.println(se);
    }



}