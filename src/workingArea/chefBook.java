package workingArea;

import java.util.*;
import java.util.Collections;

/**
 * Created by skynet on 8/3/17.
 * 
 2 4
 1 2
 1 1 WhoDoesntLoveChefBook
 2 2 WinterIsComing
 3 10 TheseViolentDelightsHaveViolentEnds
 4 3 ComeAtTheKingBestNotMiss

 * 
 * 
 * 
 */


/*
* Input:
2 4
1 2
1 1 WhoDoesntLoveChefBook
2 2 WinterIsComing
3 10 TheseViolentDelightsHaveViolentEnds
4 3 ComeAtTheKingBestNotMiss

Output:
WinterIsComing
WhoDoesntLoveChefBook
TheseViolentDelightsHaveViolentEnds
ComeAtTheKingBestNotMiss
*
* */
public class chefBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> special_popularity = new ArrayList<>();//for special friend;
        ArrayList<Integer> otherFriendPo = new ArrayList<>();// for other friend ;
        
        Map<Integer,String> specialFriendPost = new HashMap<>();
        Map<Integer,String> otherFriendPost = new HashMap<>();

        Map<Integer,Integer> specialFriendPopularity = new HashMap<>();
        Map<Integer,Integer> otherFriendPopularity = new HashMap<>();

        int n = in.nextInt();
        int m = in.nextInt();

        //add the special friend to the list
        for (int i = 0; i < n ; i++) {
            int sFriend = in.nextInt();
            special_popularity.add(sFriend);
        }

        // add the post and populartiy of the spcial friend
        for (int i = 0; i < n; i++) {
            int sFriend = in.nextInt();
            int sPolularity = in.nextInt();
            String sPost = in.next();
            specialFriendPost.put(sFriend,sPost);
            specialFriendPopularity.put(sFriend,sPolularity);

        }
        System.out.println("------------------------");
        System.out.println(special_popularity);
        System.out.println(specialFriendPopularity);
        System.out.println(specialFriendPost);


        //add the other friend and their post
        for (int i = 0; i < m - special_popularity.size(); i++) {
            int oFriend = in.nextInt();
            int oPopularity = in.nextInt();
            String oPost = in.next();

            otherFriendPo.add(oPopularity);
            otherFriendPopularity.put(oPopularity,oFriend);
            otherFriendPost.put(oFriend,oPost);
        }
        System.out.println("-------------------------------------");
        System.out.println(otherFriendPo);
        System.out.println(otherFriendPopularity);
        System.out.println(otherFriendPost);

        Collections.sort(otherFriendPo,Collections.reverseOrder());

        Collections.sort(special_popularity,Collections.reverseOrder());
        System.out.println("________________________________");
        for (int i = 0; i < special_popularity.size(); i++) {
            int index = special_popularity.get(i);
            int idx = specialFriendPopularity.get(index);
            System.out.println(specialFriendPost.get(idx));
        }

        for (int i = 0; i < otherFriendPo.size(); i++) {
            int index = otherFriendPo.get(i);  // get 10
            int idx = otherFriendPopularity.get(index);  // get 3
            System.out.println(otherFriendPost.get(idx));
        }

        System.out.println("-------------------------------------------");

    }
}
