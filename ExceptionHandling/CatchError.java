public class CatchError {
  public static void myMethod() {
    myMethod();
  }
  public static void main(String[] args) {
    try {
      myMethod();   // throws StackOverflowError
    } catch (StackOverflowError s) {
      for (int i=0; i<2; ++i)   // print 1 2
        System.out.println(i);
    }
  }
}

