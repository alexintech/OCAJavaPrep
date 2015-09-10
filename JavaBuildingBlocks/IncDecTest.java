public class IncDecTest {
  static int func(int val) {
    System.out.println(val);
    return val;
  }
  
  public static void main(String[] args) {
    int a = 10;
    a = a++ + a + a-- - a-- + ++a;
    System.out.println(a);
    System.out.println();

    a = 10;
    a = ++a + a + --a - --a + a++;
    System.out.println(a);
    System.out.println();

    a = 10;
    a = a++ + func(a);  // a was incremented before calling function,
                        // so it calls func(11)
    System.out.println("a = a++ + func(a); a equals " + a);
    System.out.println();

    a = 10;
    a = func(a) + ++a;  // preincrement perform increment right before usage
                        // the variable a, so it calls func(10)
    System.out.println("a = func(a) + ++a; a equals " + a);
    System.out.println();

    a = 10;
    a = a++;  // post-increment is not performed after assigning to a
    System.out.println("a = a++; a equals " + a);
  }
}
