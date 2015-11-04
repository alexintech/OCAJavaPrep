public class Arrays {
  static int[] testInit; // init with null

  public static void main(String[] args) {
    int[] localInit; // not initialized
    System.out.println(testInit);
    System.out.println(testInit[0]); // NullPointerException
    //! System.out.println(localInit);

    int anIntArray[], oneInteger;
    anIntArray = new int[0];
    //! anIntArray = new int[-1]; // Exception NegativeArraySizeException
    oneInteger = 5;

    System.out.println("AHA".toCharArray()[1]);

    int[] abc = {1, 2, 3, };
    System.out.println(abc.length);

    int[] a;
    //! a = {1, 2, 3}; // not an expression. It doesn't return value
    a = new int[] {1, 2, 3}; // anonymous array
    //! a = new int[3] {1, 2, 3}; // error syntax
    a[(int)2L] = 5;
    a['a'] = 1;
  }
}
