public class Switch {
  static void printDays(int dayOfWeek) {
    switch(dayOfWeek) {
      case 0:
        System.out.println("Sunday");
      default:
        System.out.println("Weekday");
      case 6:
        System.out.println("Saturday");
        break;
    }
    System.out.println();
  }

  private int getSortOrder(String firstName, final String lastName) {
    String middleName = "Patricia";
    final String suffix = "JR";
    int id = 0;
    switch(firstName) {
      case "Test":
        return 52;
      /* case middleName:  // error: not a constant
        id = 5;
        break; */
      case suffix:
        id = 0;
        break;
      /* case lastName:   // error: constant required
        id = 8;
        break;
      case 5:             // error: not compatible type
        id = 7;
        break;
      case 'J':          // error: not compatible type
        id = 10;
        break;
      case java.time.DayOfWeek.SUNDAY: // error: not compatible type
        id = 15;
        break;
      */
    }
    return id;
  }

  public static void main(String[] args) {
    printDays(5);
    printDays(6);
    printDays(0);
  }
}

