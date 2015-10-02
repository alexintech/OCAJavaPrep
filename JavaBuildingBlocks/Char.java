public class Char {
  public static void main(String[] args) {
    char c1 = 'D';
    //! char c2 = "D";  // error: cannot convert from String to char
    char c3 = 122;
    char c4 = '\u0122';
    System.out.println("c3 = " + c3);
    System.out.println("c4 = " + c4);
    //! char c5 = -122;   // error: char cannot be negative
    char c6 = (char)-122;   // OK: casting
    System.out.println("c6 = " + c6);

    Boolean []ba[];
  }
}
