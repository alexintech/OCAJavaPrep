public class StaticInitialization {
  private static int one;
  private static final int two;
  private static final int three = 3;
  //! private static final int four;    // error: final variable must be initialized
  static {
    one = 1;
    two = 2;
    //! three = 3;  // error: reassign value
    //! two = 4;    // error: variable two might already have been assigned
  }
}
