public class Assignment {
  public static void main(String[] args) {
    int[] a = {10, 20, 30, 40, 50};
    int index = 4;
    a[index] = index = 2; // evaluates as a[4] = index = 2;

    for(int elem : a) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
}
