package Java.Strings;


//Program is under maintence
import java.util.Scanner;

public class TagContentExtractor {
    public static void main(String[] args){

        /*
        * 4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
        * */
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String regex = "<[a-zA-Z0-9]>\\.</[a-zA-Z0-9]";
            if(line.matches(regex))
            System.out.println();
            else
                System.out.println("Invalide");


            testCases--;
        }
    }
}
