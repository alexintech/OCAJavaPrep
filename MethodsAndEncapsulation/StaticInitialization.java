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

  static {
    int a = 5;
    //! if(a == 5) return; // error: return outside method
    a = 6;
  }
  static int[] x = new int[4];
  static {
    x[4] = 5; // Exception in thread "main" java.lang.ExceptionInInitializerError
              // Caused by: java.lang.ArrayIndexOutOfBoundsException: 4
  }
  public static void main(String[] args) { }
}
