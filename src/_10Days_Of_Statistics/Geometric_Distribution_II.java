package _10Days_Of_Statistics;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 */

// Day 4: Geometric Distribution II

public class Geometric_Distribution_II {

    /* Probability of success(p) and Probability of failure(q) */
    public static final double p = 0.33/(0.33 + 0.66);
    public static final double q = 1-p;

    /* A static function that calculate the geometric distribution */
    public static double findGeometricDistribution(int n) {
        return Math.pow(q,n-1) * p ;
    }

    public static void main(String[] args) {
        /* Finding the Geometric Distribution and print the result */
        double Probability_inTheFirst_5_Inspection = 0;
        for (int i = 0; i <= 5; i++) {
            Probability_inTheFirst_5_Inspection = Probability_inTheFirst_5_Inspection + findGeometricDistribution(i);
        }
        System.out.printf("%.3f",Probability_inTheFirst_5_Inspection);
    }
}
