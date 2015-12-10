public class BooleanTest {
  public static void main(String[] args) {
    System.out.println(Boolean.parseBoolean("True") == new Boolean(null));
    System.out.println(new Boolean("True") == new Boolean(true));
    System.out.println(new Boolean("True") == Boolean.TRUE);
    System.out.println(new Boolean("no") == false);  // true
    System.out.println(Boolean.valueOf("true") == Boolean.TRUE);  // true
  }
}

