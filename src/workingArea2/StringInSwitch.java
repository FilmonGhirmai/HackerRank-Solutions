package workingArea2;

/**
 * Created by skynet on 5/22/17.
 * java 7 new features;
 */
public class StringInSwitch {
    public static void main(String[] args) {
        String key = "one";
         switch (key){
             case "one" :
                 System.out.println("Yes it is one ");
                 break;
             case "default" :
                 System.out.println("It is not one");
                 break;
         }
    }

}
