public class VarargsDemo {
  public static void flexiPrint(Object... data) {  // Object[]
    System.out.print("\nType: " + data.getClass().getName());

    System.out.println(" No. of elements: " + data.length);

    for(int i = 0; i < data.length; i++)
      System.out.print(data[i] + " ");
    if (data.length != 0)
      System.out.println();
  }

  public static void main(String... args) {
    int day = 1;
    String month = "March";
    int year = 2015;

    // Passing primitives and non-array types
    flexiPrint();                  // new Object[] {}
    flexiPrint(day);               // new Object[] {new Integer(day)}
    flexiPrint(day, month);        // new Object[] {new Integer(day), month}
    flexiPrint(day, month, year);  // new Object[] {new Integer(day), month,
                                   //               new Integer(year)}

    // Passing an array type
    Object[] dateInfo = {day, month, year};
    flexiPrint(dateInfo);                 // Non-varargs call
    flexiPrint((Object) dateInfo);        // new Object[] {(Object) dateInfo}
    flexiPrint(new Object[] {dateInfo});  // Non-varargs call

    // Explicit varargs or non-varargs call
    // warning: non-varargs call of varargs method with inexact argument type for last parameter;
    // flexiPrint(args);              // Warning!
    //            ^
    // cast to Object for a varargs call
    // cast to Object[] for a non-varargs call and to suppress this warning
    flexiPrint(args);              // Warning! String[]
    flexiPrint((Object) args);     // Explicit varargs call
    flexiPrint((Object[]) args);   // Explicit non-varargs call String[]
  }
}

