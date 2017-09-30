package workingArea;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/11/17.
 * Software Developer
 */
public class bitWise {
    public static void main(String[] args) {
        int a = 10;
        String bit_a = Integer.toBinaryString(a);
        System.out.println(bit_a);
        System.out.println("left shifting....");
        System.out.println(a<<1);
        System.out.println(a<<2);
        System.out.println(a<<3);
        System.out.println(a<<4);
        System.out.println("right shifting...");
        System.out.println(a>>1);
        System.out.println(a>>2);
        System.out.println(a>>3);
        System.out.println(a>>4);

        int[] l1 = {4,5,6};
        int[] l2 = {1,2,3};
        int[] l3 = new int[3];

        l3[0] = l1[0]<<1;
        l3[1] = l1[1]<<2;
        l3[2] = l1[2]<<3;

        for(int l : l1){
            System.out.print(l);
            System.out.print(" ");
        }
        System.out.println();
        for(int l : l2) {
            System.out.print(l);
            System.out.print(" ");
        }
        System.out.println();
        for(int l : l3){
            System.out.print(l);
            System.out.print(" ");
        }

    }
}
