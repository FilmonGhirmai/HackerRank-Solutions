package Java.Object_Oriented_Programming;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// super class : BiCycle.
class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

// sub class : MotorCycle.
class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }
    // class constructor
    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        // String temp = define_me();  //Fix this line
        String temp = super.define_me(); // it is fixed by adding super key word in front of it.
        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
// main Class
public class JavaMethodOverriding2 {
    public static void main(String[] args) {
        MotorCycle M=new MotorCycle();
    }
}
