package workingArea;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/11/17.
 * Software Developer
 */
public class GenericsDemo<F> {

    public  void printArray(F arr[]){
        for(F a : arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] s = {"Filmon","Ghirmai","Gebremedhin"};
        GenericsDemo g = new GenericsDemo();
        g.printArray(a);
        System.out.println();
        g.printArray(s);
    }
}
