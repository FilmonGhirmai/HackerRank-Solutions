package _10Days_Of_Statistics;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 */
// Day 5: Poisson Distribution II

public class Poisson_Distribution_II {

    public static void main(String[] args) {
        /* Given Poisson random variable with mean */
        double x = 0.8;
        double y = 1.55;

        /* Expanding the mean as X^2 to X + (X * X) */
        double Ca = 160 + 40 * (x + (x * x ));
        double Cb = 128 + 40 * (y + (y * y ));

        /* printing the result */
        System.out.printf("%.3f",Ca);
        System.out.printf("\n%.3f",Cb);
    }
}
