public class Glider2 {
  public static String glide(String s) {
    return "1";
  }
  public static String glide(String... s) {
    return "2";
  }
  public static String glide(Object o) {
    return "3";
  }
  public static String glide(String s, String t) {
    return "4";
  }
  public static void play(Long l) { }
  public static void play(Long... l) { }

  public static void main(String[] args) {
    System.out.println(glide("a"));           // glide(String)
    System.out.println(glide("a", "b"));      // glide(String, String)
    System.out.println(glide("a", "b", "c")); // glide(String...)
    System.out.println(glide(1));             // glide(Object) 1 as Integer
    //! play(4);    // error: int cannot be converted to Long
    play(4L);   // play(Long)
  }
}
