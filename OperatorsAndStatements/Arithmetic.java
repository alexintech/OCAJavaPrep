public class Arithmetic {
  public static void main(String[] args) {
    int tooBig = Integer.MAX_VALUE + 1;
    int tooSmall = Integer.MIN_VALUE - 1;

    System.out.println(tooBig);
    System.out.println(tooSmall);

    long notTooBig = Integer.MAX_VALUE + 1L;
    long notTooSmall = Integer.MIN_VALUE - 1L;
    System.out.println(notTooBig);
    System.out.println(notTooSmall);

    System.out.println(4.0 / 0.0);  // Infinity
    System.out.println(-4.0 / 0.0); // -Infinity
    System.out.println(0.0 / 0.0);  // NaN

    System.out.println(5.1E-324 - 4.9E-324);        // Underflow  0.0
    System.out.println(-Double.MIN_VALUE * 1E-1);   // Underflow  -0.0

    //! System.out.println(5 / 0);        // ArithmeticException : / by zero
    //! System.out.println(5 % 0);        // ArithmeticException : / by zero

    byte b = 3;
    b = (byte) -b; // cast required on assignment because -b is int

    b = ++b; // implicit narrowing performed

    int[] array = { 4, 8, 16 };
    int i = 1;
    array[++i] = --i; // evaluates as array[2] == --i;
    System.out.println(array[0] + array[1] + array[2]);
  }
}
