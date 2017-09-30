package workingArea2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by skynet on 7/14/17.
 */
public class LinearArray {
    private int[] data ;
    private static final Random r = new Random();
    private  int count = 0;
    public LinearArray(int size){
            data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + r.nextInt(99);
        }
    }

    //public method that search an element in the array
    public  int linearSearch(int searchkey){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == searchkey){
                return i;
            }
        }
        return -1;
    }

    //function to count how many frequency an item occurs in the array
    public int howManyTimes(int searchkey){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == searchkey){
                count++;
            }
        }
        return count;
    }

    //method to output the array value
    public String output(){
        return Arrays.toString(data);
    }


}
