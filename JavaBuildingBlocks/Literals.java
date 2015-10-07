public class Literals {
  public static void main(String[] args) {
    //! long num = 3000000000; // compile error: integer number too large
    long num = 3000000000L; // fix
    //! double notAtStart = _1000.00;   // DOES NOT COMPILE
    //! double notAtEnd = 1000.00_;     // DOES NOT COMPILE
    //! double notByDecimal = 1000_.00; // DOES NOT COMPILE
    double annoyingButLegal = 1_00_0.0_0; // this one compiles

    double a = .49;
    a = 48.; a = -.49E-4;
    System.out.println(a);

    char ch = '\141';  // octal notation
    ch = '\377';
    System.out.println(ch);

    char \u0062 = 'b';  // variable b
    ch\u0061r c = 'c';  // it's legal to use Unicode notation in any place
    System.out.println(b);

    /*! char error = '\u000a';
     * char error2 = '\u000d';
     * // Use \n and \r instead of \u000a and \u000d 
     */

    // string literal must be on one line
    //! String str = "Some string // error: unclosed string literal
    //!  2 lines";
  }
}
