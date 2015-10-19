public class Varargs {
  public static void walk(int start, int... nums) {
    System.out.println(nums.length);
  }
  public static void main(String[] args) {
    walk(1);          // 0
    walk(1, 2);       // 1
    walk(1, 2, 3);    // 2
    walk(1, new int[] {4, 5});  // 2, array can be sent as vararg parameter
    walk(1, null);    // throws a NullPoiterException, int[] nums = null in method call
  }
}
