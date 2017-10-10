package _10Days_Of_Statistics;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 4: Binomial Distribution I

public class Binomial_Distribution_I {

    /* Given Ration value of boys and girls */
    public static final double boyRation = 1.09;
    public static final double girlRation = 1;

    /* static method to find the factorial of a double number */
    public static double getFactorial(double d ){
        double fact = 1;
        for (int i = 1; i <= d; i++) {
            fact = fact * i ;
        }
        return fact;
    }

    /* Static method to find the combination of n to r and return as a double */
    public static  double  getCombination(int n , int x ) {
        return  getFactorial(n)/(getFactorial(n-x) * getFactorial(x));
    }

    /* Static method to find the binomial and return double result */
    public static double findBinomial(int x , int n , double p,double q  ) {
            return (getCombination(n,x) * Math.pow(p,x) * Math.pow(q,n-x));
    }


    public static void main(String[] args) {
        double probability_at_least_3_boys = 0;

        /* Calculating the Probability of success (p) and Probability of failure(q) */
        double p = boyRation / (boyRation + girlRation);
        double q = girlRation/ (boyRation + girlRation);

        // Probability at least 3 boys.
        for (int x = 3; x <= 6 ; x++) {
            probability_at_least_3_boys = probability_at_least_3_boys + findBinomial(x,6,p,q);
        }
        System.out.printf("%.3f",probability_at_least_3_boys);
    }
}
