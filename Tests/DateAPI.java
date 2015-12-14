import java.time.*;
import java.time.temporal.*;

public class DateAPI {
  public static void main(String[] args) {
    System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
    System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));
    System.out.println(TemporalAdjusters.next(DayOfWeek.MONDAY).adjustInto(LocalDate.now()));

    LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

    ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
    date = date.plus(Duration.ofDays(1)); // 2015-11-01T09:00-05:00[US/Eastern]
    System.out.println(date);

    date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
    date = date.plus(Period.ofDays(1));  // 2015-11-01T10:00-05:00[US/Eastern]
    System.out.println(date);
  }
}

