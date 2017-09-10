package Java.introduction;
/**
 *   Author : Filmon Ghirmai
     Github : github.com/filmonghirmai
 HackerRank : hackerrank.com/skynet21
 *
 */
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //08 05 2015   // month, date, year
        String month = in.next();
        String day = in.next();
        String year = in.next();


        //2000 < year < 3000
        if(Integer.valueOf(year) < 2000 || Integer.valueOf(year) > 3000){
            System.exit(0);
        }
        //GregorianCalendar gc = new GregorianCalendar(Integer.valueOf(year),Integer.valueOf(month),Integer.valueOf(day));
        GregorianCalendar gc = new GregorianCalendar(2015,8,5);
        Date d = gc.getTime();

        //DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        //extract the day
        String[] str = df.format(d).split(",") ;
        String dayFormatted  = str[0];

        //System.out.println(dayFormatted.toUpperCase());

        LocalDate dt = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        System.out.print(dt.getDayOfWeek());

    }
}