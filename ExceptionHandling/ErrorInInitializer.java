public class ErrorInInitializer {
  static {
    int[] counts = new int[3];

    // Exception in thread "main" java.lang.ExceptionInInitializerError
    // Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
    // 	at ErrorInInitializer.<clinit>(ErrorInInitializer.java:4)
    // int num = counts[-1];
  }
  {
    int[] counts = new int[3];
    int num = counts[-1];  // throws ArrayIndexOutOfBoundsException
  }
  public static void main(String[] args) {
    // ErrorInInitializer error = new ErrorInInitializer();

    try {
      throw new ExceptionInInitializerError();
    } catch (ExceptionInInitializerError e) {
      e.printStackTrace();
    }
  }
}

