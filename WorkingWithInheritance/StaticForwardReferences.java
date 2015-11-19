public class StaticForwardReferences {
  static {
    System.out.println("sf1: " + StaticForwardReferences.sf1);
    sf1 = 10;          // OK. Assignment to sf1 allowed
    //! sf1 = if1;         // error: non-static field access in static context
    //! int a = 2 * sf1;   // error: illegal forward reference
    int b = sf1 = 20;  // OK. Assignment to sf1 allowed
    int c = StaticForwardReferences.sf1;  // OK. Not accessed by simple name
  }

  static int sf1 = sf2 = 30;
  static int sf2;
  int if1 = 5;

  static {
    int d = 2 * sf1;
    int e = sf1 = 50;
  }

  public static void main(String[] args) {
    System.out.println("sf1: " + StaticForwardReferences.sf1);
    System.out.println("sf2: " + StaticForwardReferences.sf2);
  }
}

