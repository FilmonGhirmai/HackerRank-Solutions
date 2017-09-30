package workingArea;

import java.util.Scanner;

public class ClassDemo {
  private  int testScores[] ;

    ClassDemo(int[] score){
       // System.arraycopy(score,0,this.testScores,0,score.length);
        this.testScores = new int[score.length];
        System.arraycopy(score,0,this.testScores,0,score.length);
    }

    private void  Calculate(){
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }
        System.out.println("Student scores is : " + sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numScores = new int[n];
        for (int i = 0; i < n; i++) {
            numScores[i] = in.nextInt();
        }
        ClassDemo student = new ClassDemo(numScores);
        student.Calculate();
        
    }
}
