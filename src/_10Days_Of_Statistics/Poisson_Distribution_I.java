package _10Days_Of_Statistics;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
// Day 5: Poisson Distribution I

public class Poisson_Distribution_I {

    /* Constant value*/
    public static final double e = 2.71828;

    /* static method to find the factorial of a double number */
    public static double getFactorial(double d ){
        double fact = 1;
        for (int i = 1; i <= d; i++) {
            fact = fact * i ;
        }
        return fact;
    }

    /* Finding Poisson Distribution */
    public static double getPoissonDistribution(double lamda,int k ) {
        return (Math.pow(lamda,k) * Math.pow(e,-lamda))/getFactorial(k);
    }

    public static void main(String[] args) {

        double lamda = 2.5;
        int  k = 3;
        double probability ;
        probability = getPoissonDistribution(lamda,k);
        System.out.printf("%.3f",probability);
    }
}
