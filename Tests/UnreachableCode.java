public class UnreachableCode {
  static String[] days = {"monday", "tuesday", "wednesday"};

  public static void main(String[] args) {
    int index = 0;
    for(String day : days) {
      if (index == 3) {
        break;
      } else {
        continue;  // makes following code unreachable
      }
      //! index++;  // unreachable statement
    }

    if (true) {
      //! break; // error: break outside switch or loop
    }

    {
      //! break; // error: also illegal
    }
  }
}

