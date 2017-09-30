package workingArea2;

import java.util.Scanner;

/**
 * Created by skynet on 4/23/17.
 */
/* (3) Selection sort */

public class bigger {
private int[] list;
private int[] unsortedElements;

   private bigger(){

    }

    //sorting out the numbers
    private void sort(int[] unsortedArray){
       int smallest;
       unsortedElements = unsortedArray;
       list = unsortedArray;
        for (int i = 0; i < list.length - 1; i++) {
            smallest = i;
            for (int index = i+1 ; index < list.length ; index++){
                if(list[index] < list[smallest]){
                    smallest = index;
                    swap(i,smallest);
                }
            }
        }
    }

    private void displayUnsortedArray() {
        System.out.println("Displaying Unsorted elements ...");
        for (int i = 0; i < unsortedElements.length; i++) {
            System.out.print(unsortedElements[i]);
            if(i < unsortedElements.length-1){
                System.out.print(" , ");
            }
        }
    }

    private void displaySortedArray(){
        System.out.println("\nDisplaying the Sorted elements...");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] );
            if (i < list.length-1){
                System.out.print(" , ");
            }
        }
    }

    //A helper method to swap elements
    private  void swap(int first, int second) {
        int temp = list[first];
            list[first] = list[second];
            list[second] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of elements...");
        int k = sc.nextInt();

        System.out.println("Enter the numbers...");
        int[] unsortedArray = new int[k];
        for (int i = 0; i < k; i++) {
            unsortedArray[i] = sc.nextInt();
        }
        bigger b = new bigger();
        b.sort(unsortedArray);
        b.displayUnsortedArray();
        b.displaySortedArray();
    }

}
