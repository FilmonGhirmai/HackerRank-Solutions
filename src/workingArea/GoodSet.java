package workingArea;

import java.util.*;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/5/17.
 * Software Developer
 */
public class GoodSet {
    static Random r = new Random();
    static int k;

    public static ArrayList<Integer> randomGenerator() {
        Set<Integer> seti = new HashSet<>();
        ArrayList<Integer> listi = new ArrayList<>();
        for (int i = 0; i < k ;i++) {
            int g = 1 + r.nextInt(50);
            if (seti.add(g)) {
                //do noting
            } else {
                i--;
            }
        }
            listi.addAll(seti);
            if (!isGoodset(listi)) {
                listi.clear();
                seti.clear();
                return  randomGenerator();
            }else{
                return listi;
            }
    }

    public static boolean isGoodset(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if (list.contains(sum)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the set numbers...");
        int n = in.nextInt();
        GoodSet.k = n;
        ArrayList<Integer> arrayList = randomGenerator();
        System.out.println(arrayList);
        System.out.println("-------------------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                int sum = arrayList.get(i) + arrayList.get(j);
                System.out.println(arrayList.get(i) + " + " + arrayList.get(j) + " = " + sum);
            }
        }
        System.out.println("-------------------------------");
        System.out.println("It's workingArea.GoodSet!!");
    }
}
