package Java.Object_Oriented_Programming;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

 class Arithmetic {
    public int add(int e1 , int e2 ) {
        return e1 + e2;
    }
}

 class Adder extends Arithmetic {
     // class Adder will inherit the add method from the super class Arithmetic.
 }

public class JavaInheritance_II {

  public static void main(String[] args) {
      // Create a new Adder object
      Adder a = new Adder();

      // Print the name of the superclass on a new line
      System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

      // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
      System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
  }
}
