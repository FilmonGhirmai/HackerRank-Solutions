package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/26/17.
 * Software Developer
 */
public class ComarableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        Collections.sort(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
    }
}
