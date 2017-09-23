package Java.Advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }

}
public class JavaReflection_Attributes {

    public static void main(String[] args) {
        Method[] methods = new Method[0];
        try {
            //Class.forName() should have the name of the class "Student"
            //in my project it is in "java.Advanced.Student"
            Class student = Class.forName("Java.Advanced.Student");
            methods = student.getDeclaredMethods();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

}
