public class MultipleReturn {
  int getInt() {
    try {
      String[] students = {"harry", "paul"};
      System.out.println(students[5]);
    } catch (Exception e) {
      return 10;
    } finally {
      return 20;  // this value will be returned
    }
  }
  public static void main(String[] args) {
    MultipleReturn var = new MultipleReturn();
    System.out.println(var.getInt()); // 20
  }
}

