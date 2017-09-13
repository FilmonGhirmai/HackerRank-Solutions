package Java.DataStructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if(a.score != b.score){
            return (a.score < b.score ? 1 : -1);
        }else{
            return a.name.compareTo(b.name);
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
