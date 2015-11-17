class OverloadTest1 {
  static void printFirst(Integer... ints) {
    System.out.println("Integer...: " + ints[0]);
  }
  static void printFirst(Number... nums) {
    System.out.println("Number...: " + nums[0]);
  }
  static void printFirst(Object... objs) {
    System.out.println("Object...: " + objs[0]);
  }
  public static void main(String[] args) {
    printFirst(10);         // Integer...
    printFirst((byte)20);   // Number...
    printFirst('3', '0');   // Object...
    printFirst("40");       // Object...
    printFirst((short)50, 55); // Number...
    printFirst((Number[])new Integer[] {70, 75}); // Number...
  }
}

class OverloadTest2 {
  static String compute(long... ls) { return "ONE"; }
  static String compute(Long... ls) { return "TWO"; }
  static String compute(Integer i1, Integer i2) { return "THREE"; }
  static String compute(Long l1, Long l2) { return "FOUR"; }
  static String compute(Number n1, Number n2) { return "FIVE"; }

  public static void main(String[] args) {
    System.out.println(compute((byte)5, (byte)10) + ", " + compute(5, 10));
    // Five, Three
    System.out.println(compute(5L, 10) + ", " + compute(5L, 10L));
    // Five, Four
  }
}

