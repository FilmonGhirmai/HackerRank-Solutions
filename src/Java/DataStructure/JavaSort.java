package Java.DataStructure;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
// complete the code
class myChecker implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        if(st1.getCgpa() != st2.getCgpa()){
            return (st1.getCgpa() < st2.getCgpa() ? 100 : -100);
        }else if(!st1.getFname().equals(st2.getFname())){
            return st1.getFname().compareTo(st2.getFname());
        }else{
            return (st1.getId() < st2.getId() ? 100 : -100);
        }
    }
}

public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        //sort the students using my custom comparator
        myChecker comp = new myChecker();
        studentList.sort(comp);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
