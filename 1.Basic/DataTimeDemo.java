import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
 
@SuppressWarnings("ALL")
public class DataTimeDemo {
    public static void main(String[] args) {
 
        System.out.println(System.currentTimeMillis());
        long year=(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(year);


        LocalDateTime now = LocalDateTime.now();

        // Formatting and printing the date and time
        System.out.println("Date    : " + now.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Day     : " + now.getDayOfWeek()); // DayOfWeek enum provides a better representation
        System.out.println("Month   : " + now.getMonth());
        System.out.println("Year    : " + now.getYear());
        System.out.println("Hours   : " + now.getHour());
        System.out.println("Minutes : " + now.getMinute());
        System.out.println("Seconds : " + now.getSecond());
 
 
        GregorianCalendar o =new GregorianCalendar();
        //System.out.println(o);
        System.out.println(o.isLeapYear(2020));
        System.out.println("Date  : "+o.get(Calendar.DATE));
        System.out.println("Month : "+o.get(Calendar.MONTH));
        System.out.println("Year  : "+o.get(Calendar.YEAR));
        System.out.println("Day of Week  : "+o.get(Calendar.DAY_OF_WEEK)); //1-Sun to 7-Sat
        System.out.println("Day of Year  : "+o.get(Calendar.DAY_OF_YEAR));
 
    }
}