public class Assignment {
  public static void main(String[] args) {
    int[] a = {10, 20, 30, 40, 50};
    int index = 4;
    a[index] = index = 2; // evaluates as a[4] = index = 2;

    for(int elem : a) {
      System.out.print(elem + " ");
    }
    System.out.println();

    Boolean boolRef = true;     // boxing
    Byte bRef = 2;              // constant in range: narrowing to byte, then boxing
    //! Byte bRef2 = 257;           // constant not in range: cast required
    //! Integer iRef3 = (short)10;  // short not assignable to Integer

    short s = 10;           // narrowing
    //! Integer iRef1 = s;      // short not assignable to Integer

    //! Integer iRef1 = 'a';        // not compatible types

    boolean bv1 = boolRef;  // unboxing
    byte b1 = bRef;         // unboxing

    Integer iRefVal = null;     // always allowed
    int j = iRefVal;            // NullPointerException!
    if (iRefVal != null) j = iRefVal;   // avoids the exception
  }
}
