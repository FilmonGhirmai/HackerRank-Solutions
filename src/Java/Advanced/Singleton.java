package Java.Advanced;

/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */

class Singleton {
    private Singleton() { }

    public String str ;
    private static Singleton instance = new Singleton();
    public static Singleton getSingleInstance() {
        return instance;
    }

}
