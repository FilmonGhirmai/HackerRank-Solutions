package Thirty_Day_OF_Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //check input constraints...
        if(n<2 || n > 30 )
            System.exit(0);
        String regfirstName = "[a-z]+";
        String regEmailID =  ".+@gmail\\.com$";
        String gmailRegEx =  ".+@gmail\\.com$";

        Pattern pgmail = Pattern.compile(gmailRegEx);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String firstName = in.next();
            String emailID  =  in.next();

            if(Pattern.matches(regfirstName,firstName) && firstName.length() <=20){
                    if(Pattern.matches(regEmailID,emailID) && emailID.length() <= 50){
                        Matcher matcher = pgmail.matcher(emailID);
                        if(matcher.matches()){
                            list.add(firstName);
                        }
                    }
            }
        }
        Collections.sort(list);
        for(String name : list){
            System.out.println(name);
        }
    }
}
