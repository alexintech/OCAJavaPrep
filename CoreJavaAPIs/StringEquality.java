public class StringEquality {
  public static void main(String[] args) {
    String x = "Hello World";   // string literals are in the string pool
    String y = "Hello World";
    System.out.println(x == y);   // true

    String z = "Hello World".trim(); // returns the same object if no changes made
    System.out.println(x == z);   // true

    String a = " Hello World".trim();
    System.out.println(x == a);   // false

    String objInHeap = new String("Hello World");
    System.out.println(x == objInHeap);   // false

    StringBuilder sb = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb == sb2);        // false
    System.out.println(sb.equals(sb2));   // false
                    // StringBuilder does not override Object's equals()
  }
}

