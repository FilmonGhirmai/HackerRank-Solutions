package workingArea2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by skynet on 7/18/17.
 */
public class hashSet {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<>();
        Set<String> dups   =  new HashSet<>();

          for(String a : args){
              if(!uniques.add(a))
                  dups.add(a);
          }
          //printing
        System.out.println("uniques" + uniques);
        System.out.println("dups" + dups);

        }


}
