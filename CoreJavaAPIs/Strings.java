public class Strings {
  public static void main(String[] args) {
    String initializedToNull = null;
    initializedToNull += "Java";
    System.out.println(initializedToNull);

    StringBuilder sb1 = new StringBuilder("0123456");
    sb1.replace(2, 4, "ABCD");
    System.out.println(sb1);

    StringBuilder sb2 = new StringBuilder("0123456");
    System.out.println(sb2.subSequence(2, 4));
    System.out.println(sb2);

    System.out.println(String.valueOf(new char[]{'a', 'h', 'a'}));
    System.out.println(new char[]{'a', 'h', 'a'});

    StringBuilder test = new StringBuilder("Some string");
    test.setLength(3);    // Truncates string
    System.out.println(test);  // Som
  }
}

