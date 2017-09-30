package workingArea2;

import java.util.Arrays;

/**
 * Created by skynet on 7/14/17.
 */
public class ArrayManipulation {
    public static void main(String[] args) {
        double[] arrayDouble = {3.2,4.3,1.1,2.3,5.5};

        //sorted double array in ascending
        Arrays.sort(arrayDouble);
        for(double value : arrayDouble) {
            System.out.println(value);
        }
        System.out.println("++++++++++++++++++++++++++++++");
        //searching a value 5 in the array
        int[] items = {4,5,3,2,9,8,7,6,2};
        int postion = Arrays.binarySearch(items,5);
        if(postion >=0){
            System.out.println("Yes it is in the array");
        }else{
            System.out.println("No it is not in the array");
        }
        System.out.println("++++++++++++++++++++++++++++++");
        // search and find the location of the element in array
        //find black color position .
        String[] colors = {"red","green","blue","yellow","white","black","brown"};
        for (int i = 0; i < colors.length; i++) {
            if(colors[i].equalsIgnoreCase("black")){
                System.out.println("Found at position:" + i);
            }

        }
        //find a string and replace
        //find php and replace by java
        String[] programmingLang = {"javascript","jquery","swift","php","c"};
        for (int i = 0; i < programmingLang.length; i++) {
            if(programmingLang[i].equalsIgnoreCase("php")){
                programmingLang[i] = "java";
            }
        }
        System.out.println("++++++++++++++++++++++++++++++");
        for(String pLang : programmingLang){
            System.out.println(pLang);
        }

    }
}
