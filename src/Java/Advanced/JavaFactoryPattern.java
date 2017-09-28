package Java.Advanced;

import java.security.Permission;
import java.util.Scanner;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// interface Food
interface Food {
    public String getType();
}

// class Pizza that implements the interface Food
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

// class Cake that implements Food interface.
class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

// A factory class that return an object of other class.
class FoodFactory {
    public Food getFood(String order) {
        if (order.equals("cake")) {
            return  new Cake();
        } else {
            return new Pizza();
        }
    }
}

public class JavaFactoryPattern {
    public static void main(String args[]){
        Do_Not_Terminate.forbidExit();
        try{

            Scanner sc=new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());


            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
