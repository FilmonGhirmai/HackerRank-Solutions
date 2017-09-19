package Java.DataStructure;


import java.util.*;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
class Student1 {

    // student information
    private int Id;
    private String Name;
    private double Cgpa;

    // Class constructor that initialize the class field members.
    public Student1(int id, String name, double cgpa) {
        this.Id = id;
        this.Name = name;
        this.Cgpa = cgpa;
    }

    // class method that return student id.
    public int getId() {
        return this.Id;
    }

    // class method that return student name.
    public String getName() {
        return this.Name;
    }

    // class method that return student Cumulative grade point average.
    public double getCgpa() {
        return this.Cgpa;
    }
}

class Priorities {

    static final Comparator<Student1> comp = new Comparator<Student1>() {
        @Override
        public int compare(Student1 student1, Student1 student2) {
            if (student1.getCgpa() != student2.getCgpa()) {
                return student1.getCgpa() < student2.getCgpa() ? 100 : -100 ;//
            } else if (!student1.getName().equals(student2.getName())) {
                return student1.getName().compareTo(student2.getName());
            }else{
                return student1.getId() < student2.getId() ? -100 : 100;
            }
        }
    };



  public  List<Student1> getStudents(List<String> events){

      List<Student1> arraylist = new ArrayList<>();

      for (String s : events) {
          String[] str = s.split(" ");
          String type = str[0];
          if (type.equals("ENTER")) {
              // ENTER name CGPA id
              int id = Integer.parseInt(str[3]);
              String name = str[1];
              double cgpa = Double.parseDouble(str[2]);
              Student1 st = new Student1(id,name,cgpa);
              arraylist.add(st);
              Collections.sort(arraylist,comp);
          }
          else {
              if (!arraylist.isEmpty()) {
                  arraylist.remove(0);
              }
          }
      }
        return arraylist;
    }

}

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student1> students = priorities.getStudents(events);

        if ( students.isEmpty()) {
            System.out.println("EMPTY");
        }
        else {
            for (Student1 st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

