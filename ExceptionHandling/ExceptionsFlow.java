public class ExceptionsFlow {
  public static void main(String[] args) {
    String result = "";
    String v = null;
    try {
      try {
        result += "before ";  // 1
        v.length();
        result += "after ";
      } catch (NullPointerException e) {
        result += "catch ";   // 2
        throw new RuntimeException();
      } finally {
        result += "finally "; // 3
        throw new Exception();
      }
    } catch (Exception e) {
      result += "done";       // 4
    }
    System.out.println(result);
  }
}

