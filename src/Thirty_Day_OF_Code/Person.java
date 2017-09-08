package Thirty_Day_OF_Code;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/FilmonGhirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.util.Scanner;
/**
* A program that demonstrate <b>class</b> and <b>class methods</b>.
*/
public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }else if( initialAge > 0){
            this.age = initialAge;
        }
    }


    /**
    * A method that check a person age
     * return - void
    * */
    public void amIOld() {
        if(this.age < 13){
            System.out.println("You are young.");
            this.yearPasses();
        }else if(this.age >= 13 && this.age < 18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
            this.yearPasses();
        }
    }

   /**
    * A method that check the years passed
    * */
    public void yearPasses() {
        // Increment this person's age.
        this.age = this.age + 1;
    }

    /**
    * The Main method
    * @param args - Array of Strings
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

    }
