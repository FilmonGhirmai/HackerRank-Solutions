package workingArea;

import java.util.ArrayList;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int t = in.nextInt();
        in.nextLine();
        if(t < 1 || t > 100){
            System.exit(0);
        }
        for (int i = 0; i < t; i++) {
            String line = in.nextLine();
            Scanner inFromString = new Scanner(line);
            while (inFromString.hasNextInt()){
                 list.add(inFromString.nextInt());
            }
            int outNum = list.size() - 1;
            int index = list.indexOf(outNum);
            list.remove(index);
            int max = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) >  max)
                    max = list.get(j);
            }
            System.out.println(max);
            list.clear();
        }
    }
}
