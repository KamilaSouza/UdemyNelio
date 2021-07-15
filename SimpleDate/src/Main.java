import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date3.setTimeZone(TimeZone.getTimeZone("GMT")); // to set to GMT time

        Date d1 = date1.parse("15/07/2021");
        Date d2 = date2.parse("15/07/2021 11:41:11");
        Date d3 = new Date();
        Date d4 = new Date(System.currentTimeMillis());
        Date d5 = new Date(0L);
        Date d6 = new Date(1000L * 60 * 60 * 5);  //1000 milliseconds, 60 seconds, 60 minutes, 5 hours
        Date d7 = Date.from(Instant.parse("2021-07-15T12:05:01Z"));

        System.out.println(d7);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d7);
        calendar.add(Calendar.HOUR_OF_DAY, 4);
        d7 = calendar.getTime();
        int minutes = calendar.get(calendar.MINUTE);
        int month = 1 + calendar.get(calendar.MONTH); // calendar starts at 0 (january)
        System.out.println(minutes);
        System.out.println(month);

        System.out.println(date2.format(d7));
//        System.out.println(date3.format(d1));
//        System.out.println();
//        System.out.println(date2.format(d3));
//        System.out.println(date3.format(d3));
//        System.out.println();
//        System.out.println(d3);
//        System.out.println(d4);
//        System.out.println(d5);
//        System.out.println(d6);
//        System.out.println("ISO " + d7);
    }
}
