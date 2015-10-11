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

    final int a = 10;
    final int b = 20;
    final int c = 30;
    final int d;  // d is not initialized right after declaration, so it is not
                  // a compile-time constant
    d = 40;
    switch(a) {
      case b+c: System.out.println(b + c); break;   // OK
      case 10*7: System.out.println(b + c); break;  // OK
      //! case d+c: System.out.println(d + c); break;  // error: d is not compile-time constant 
      //! case d: System.out.println(d); break;  // error: d is not compile-time constant 
      case b: System.out.println(b); break;  // OK 
      case 'a': System.out.println('a'); break;  // OK 
      //! case (short)b: System.out.println((short)b); break;  // error: duplicate case value
      case (short)15: System.out.println((short)15); break;  // OK 
    } 

    String name = "Paul";
    switch(name) {
      case "Paul": System.out.println("Paul"); break;
      //! case null: System.out.println("null"); break; // error: null isn't allowed
    }
  }
}

