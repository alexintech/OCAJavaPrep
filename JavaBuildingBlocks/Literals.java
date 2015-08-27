public class Literals {
  public static void main(String[] args) {
    // long num = 3000000000; // compile error: integer number too large
    long num = 3000000000L; // fix
    double notAtStart = _1000.00;   // DOES NOT COMPILE
    double notAtEnd = 1000.00_;     // DOES NOT COMPILE
    double notByDecimal = 1000_.00; // DOES NOT COMPILE
    double annoyingButLegal = 1_00_0.0_0; // this one compiles
  }
}
