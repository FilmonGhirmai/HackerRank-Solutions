package Algorithms;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        int adding_factor ;
        String[] time = s.split(":");
        //Remove the AM or PM status from the time;

        time[2] = time[2].substring(0,2);
        //check if the given time is AM or PM.
        if(s.contains("P")){
            if(Integer.parseInt(time[0]) == 12)
                adding_factor = 0;
            else
               adding_factor = 12;
        }else if(s.contains("A")){
            //check if the time is 12:xx:xx:AM
            if(Integer.parseInt(time[0]) == 12){
                adding_factor = -12;
            }else{
                adding_factor = 0;
            }
        }else{
            adding_factor =0;
            System.exit(0);
        }
        String convertedTime = null;
        String seconds = time[2].substring(0,2);
        if (    Integer.parseInt(time[0]) < 1 || Integer.parseInt(time[0]) > 23
             || Integer.parseInt(time[1]) < 0 || Integer.parseInt(time[1]) > 59
             || Integer.parseInt(time[2]) < 0 || Integer.parseInt(time[2]) > 59){
                System.exit(0);
        }else{
            if(Integer.parseInt(time[0]) == 12 && s.contains("A"))
            convertedTime = String.valueOf((adding_factor + Integer.parseInt(time[0])) + "0" );
            else if(Integer.parseInt(time[0])  < 12 && s.contains("A"))
                convertedTime = String.valueOf("0" + (adding_factor + Integer.parseInt(time[0]))  );
            else
            convertedTime = String.valueOf(adding_factor + Integer.parseInt(time[0]) );
        }
        return (convertedTime + ":" + time[1] + ":" + seconds);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
