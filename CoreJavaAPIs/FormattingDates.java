import java.time.*;
import java.time.format.*;
import java.util.*;
import java.text.*;

public class FormattingDates {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 20);
    System.out.println(date.getDayOfWeek());  // THURSDAY
    System.out.println(date.getMonth());      // JANUARY
    System.out.println(date.getYear());       // 2020
    System.out.println(date.getDayOfYear());  // 51

    LocalTime time = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));  // 2020-02-20
    System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));  // 11:12:34
    System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    // 2020-02-20T11:12:34

    DateTimeFormatter shortDateTime =
      DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    System.out.println(shortDateTime.format(dateTime));  // 2/20/20
    System.out.println(shortDateTime.format(date));  // 2/20/20
    // System.out.println(shortDateTime.format(time));  // throws UnsupportedTemporalTypeException

    // the same
    System.out.println(dateTime.format(shortDateTime));  // 2/20/20
    System.out.println(date.format(shortDateTime));  // 2/20/20
    // System.out.println(time.format(shortDateTime));  // throws UnsupportedTemporalTypeException

    DateTimeFormatter shortF =
      DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    DateTimeFormatter mediumF =
      DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    System.out.println(shortF.format(dateTime));  // 2/20/20 11:12 AM
    System.out.println(mediumF.format(dateTime));  // Feb 20, 2020 11:12:34 AM

    DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
    System.out.println(dateTime.format(f));  // February 20, 2020, 11:12

    // -- Old way --- //
    Calendar cal = Calendar.getInstance();
    cal.set(2020, 0, 20, 13, 30);
    Date jan3 = cal.getTime();
    SimpleDateFormat sf = new SimpleDateFormat("MMMM dd, yyyy, HH:mm");
    System.out.println(sf.format(jan3));  // January 20, 2020, 09:30

    DateTimeFormatter fp = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate dateParse = LocalDate.parse("01 02 2015", fp);
    LocalTime timeParse = LocalTime.parse("11:22");
    System.out.println(dateParse);  // 2015-01-02
    System.out.println(timeParse);  // 11:22
  }
}

