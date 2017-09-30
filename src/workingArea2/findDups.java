package workingArea2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by skynet on 7/18/17.
 *
 */
public class findDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        for (String a : args){
            if(s.add(a)){
                System.out.println("Distinct fount " + a);
            }else{
                System.out.println("Duplicate found " + a);
            }
        }

        System.out.println("print the set items");
        System.out.println("Siz of the set is " + s.size());
        for(String ss : s ){
            System.out.println(ss);
        }
    }
}
