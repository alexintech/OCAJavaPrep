public class ParameterPassing {
  static void doIt(long i) {
    System.out.println(i);
  }
  public static void main(String[] args) {
    Integer intRef = 34;
    Long longRef = 34L;
    doIt(34);
    doIt(longRef);
    doIt(intRef); // Integer -> int -> long
  }
}
