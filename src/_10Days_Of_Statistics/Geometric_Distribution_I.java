package _10Days_Of_Statistics;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
// Day 4: Geometric Distribution I

public class Geometric_Distribution_I {

    /* Probability of success(p) and Probability of failure(q) */
    public static final double pr = 0.33;
    public static final double qr = 0.66;

    /* A static function that calculate the geometric distribution */
    public static double findGeometricDistribution(int n,double p ,double q) {
        return Math.pow(q,n-1) * p ;
    }

    public static void main(String[] args) {
        double p = pr/(pr+qr);
        double q = 1 - p;
     /* Finding the Geometric Distribution and print the result */
        System.out.printf("%.3f",findGeometricDistribution(5,p,q));
    }
}
