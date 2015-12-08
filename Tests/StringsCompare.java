public class StringsCompare {
  public static void main(String[] args) {
    String str1 = "one";
    String str2 = "two";
    System.out.println(str1.equals(str1 = str2)); // "one".equals("two")
  }
}

