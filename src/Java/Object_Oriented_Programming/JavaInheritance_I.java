package Java.Object_Oriented_Programming;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Base class Animal
class Aninaml {
    public void walk() {
        System.out.println("I am walking");
    }
}

// sub class Bird
class Bird extends Aninaml {

    // Bird class will inherit the walk() method

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }


}

public class JavaInheritance_I {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
