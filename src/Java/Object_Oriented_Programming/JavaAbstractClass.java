package Java.Object_Oriented_Programming;

import java.util.Scanner;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 */

// An abstract class
abstract class Book{
    String title;
    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }
}

// MyBook class that extends the Book
 class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title = s;
    }

}
// Main class
public class JavaAbstractClass {
    public static void main(String[] args) {
        // Book new_novel = new Book();
        // This line prHMain.java:25: error: Book is abstract;
        // cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }

}
