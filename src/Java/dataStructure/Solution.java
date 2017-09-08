package Java.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Program : Java Map */

public class Solution  {
    public static void main(String []arg) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        /* A HashMap Collection that store <key,value> pair */
        Map<String,Integer>  map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        if(n < 1 || n > 100000)
            System.exit(0);

        /* input the name and phone number */
        for(int i = 0; i < n; i++) {
            String name = br.readLine();
            int phone = Integer.parseInt(br.readLine());
            map.put(name,phone);
        }

        /* output the result */
        while(n-- > 0){
            String s = br.readLine();
            // Write code here
            if(map.get(s) != null)
                System.out.println(s + "=" + map.get(s));
            else{
                System.out.println("Not found");
            }
        }
       br.close();
    }

}

