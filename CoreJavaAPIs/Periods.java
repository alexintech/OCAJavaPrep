import java.time.*;

public class Periods {
  private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
    LocalDate upTo = start;
    while (upTo.isBefore(end)) {
      System.out.println("give new toy: " + upTo);
      upTo = upTo.plusMonths(1);
    }
  }
  private static void performAnimalEnrichment(LocalDate start, LocalDate end,
      Period period) {
    LocalDate upTo = start;
    while (upTo.isBefore(end)) {
      System.out.println("give new toy: " + upTo);
      upTo = upTo.plus(period); // adds the period
    }
  }
  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
    LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
    performAnimalEnrichment(start, end);

    Period period = Period.ofMonths(1);
    performAnimalEnrichment(start, end, period);

    System.out.println(period);
    Period annually = Period.ofYears(1);
    Period quaterly = Period.ofMonths(3);
    Period everyThreeWeeks = Period.ofWeeks(3);
    Period everyOtherDay = Period.ofDays(2);
    Period everyYearAndWeek = Period.of(1, 0, 7);
    System.out.println(everyYearAndWeek);

    Period wrong = Period.ofYears(1).ofWeeks(1); // every week
    System.out.println(wrong);

    LocalTime time = LocalTime.of(6, 15);
    Period per = Period.ofMonths(1);
    // System.out.println(time.plus(per)); // throws UnsupportedTemporalTypeException:
                                           // Unsupported unit: Months
    Duration dur = Duration.ofDays(5);
    System.out.println(time.plus(dur));     // OK
    // System.out.println(start.plus(dur)); // throws UnsupportedTemporalTypeException:
                                            // Unsupported unit: Seconds


  }
}

