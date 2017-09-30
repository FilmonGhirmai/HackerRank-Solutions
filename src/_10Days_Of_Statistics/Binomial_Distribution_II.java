package _10Days_Of_Statistics;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

// Day 4: Binomial Distribution II

public class Binomial_Distribution_II {

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

        double probability_at_most_2_Rejected = 0;
        double probability_at_least_2_Rejected = 0;

        /* Calculating the Probability of success (p) and Probability of failure(q) */
        double p = 0.12;
        double q = 0.88;

        // Case 1 : Probability at most 2 Rejected.
        for (int x = 0; x <= 2 ; x++) {
            probability_at_most_2_Rejected = probability_at_most_2_Rejected + findBinomial(x,10,p,q);
        }

        // Case 2 : Probability at least 2 Rejected.
        for (int x = 2; x <= 10 ; x++) {
            probability_at_least_2_Rejected = probability_at_least_2_Rejected + findBinomial(x,10,p,q);
        }

        System.out.printf("%.3f",probability_at_most_2_Rejected);
        System.out.printf("\n%.3f",probability_at_least_2_Rejected);

    }

}
