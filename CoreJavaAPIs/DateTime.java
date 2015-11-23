import java.time.*;
import java.util.*;

public class DateTime {
  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());

    LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
    LocalDate date2 = LocalDate.of(2015, 1, 20);

    LocalTime time1 = LocalTime.of(6, 15);          // hour and minute
    LocalTime time2 = LocalTime.of(6, 15, 30);      // + seconds
    LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

    LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
    LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

    //! LocalDate d = new LocalDate(); // error: constructors are private
    // LocalDate.of(2015, Month.FEBRUARY, 29);  // throws DateTimeException

    // --- Old way --- //
    Date d = new Date();    // contains the current date, time and timezone
    System.out.println(d);

    Calendar c = Calendar.getInstance();
    c.set(2015, Calendar.JANUARY, 1);
    Date jan = c.getTime();
    System.out.println(jan);

    c = new GregorianCalendar(2015, Calendar.JANUARY, 1);
    jan = c.getTime();
    System.out.println(jan);

    c = Calendar.getInstance();
    c.set(2015, 0, 1);
    jan = c.getTime();
    System.out.println(jan);

    // --- Manipulating dates and times --- //
    LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
    System.out.println(date); // 2014-01-20
    date = date.plusDays(2);
    System.out.println(date); // 2014-01-22
    date = date.plusWeeks(1);
    System.out.println(date); // 2014-01-29
    date = date.plusMonths(1);
    System.out.println(date); // 2014-02-28
    date = date.plusYears(5);
    System.out.println(date); // 2019-02-28

    date = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time = LocalTime.of(5, 15);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    System.out.println(dateTime); // 2020-01-20T05:15
    dateTime = dateTime.minusDays(1);
    System.out.println(dateTime); // 2020-01-19T05:15
    dateTime = dateTime.minusHours(10);
    System.out.println(dateTime); // 2020-01-18T19:15
    dateTime = dateTime.minusSeconds(30);
    System.out.println(dateTime); // 2020-01-18T19:14:30

    //! date = date.plusMinutes(1);  // error: date does not operate with minutes

    // -- Old way manipulation --- //
    jan = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(jan);
    cal.add(Calendar.DATE, 1);
    jan = cal.getTime();
    System.out.println(jan);
  }
}

