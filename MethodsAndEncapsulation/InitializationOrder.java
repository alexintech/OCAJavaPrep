public class InitializationOrder {
  static { add(2); }  // 1
  static void add(int num) { System.out.println(num + " "); }

  InitializationOrder() { add(5); }       // 6

  static { add(4); }  // 2
  { add(6); }         // 4
  static { new InitializationOrder(); }   // 3
  { add(8); }         // 5
  static { add(9); }  // 7

  public static void main(String[] args) { }
}
