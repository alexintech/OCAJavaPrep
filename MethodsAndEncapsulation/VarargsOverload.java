public class VarargsOverload {
  static void compute(int... is) {
    System.out.print("|");
    for(int i : is) {
      System.out.print(i + "|");
    }
    System.out.println();
  }
  static void compute(int[] ia, int... is) {
    compute(ia);
    compute(is);
  }
  static void compute(int[] inta, int[]... is) {
    for(int ia : inta) {
      compute(ia);
    }
  }
  public static void main(String[] args) {
    compute(new int[] {10, 11}, new int[] {12,13,14});  // calls compute(int[], int...)
    compute(15, 16);    // calls compute(int...)
    compute(new int[] {17, 18}, new int[][] {{19}, {20}}); // calls compute(int[], int[][])
    compute(null, new int[][] {{21}, {22}}); // calls compute(int[], int[][])
    // throws NullPointerException because of the first argument is null
  }
}

