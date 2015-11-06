import static java.util.Collections.binarySearch;
import static java.util.Arrays.binarySearch;
import static mypkg.Auxiliary.binarySearch;  // Causes signature conflict

class MultipleStaticImport {
  public static void main(String[] args) {
    int index = binarySearch(new int[] {10, 50, 100}, 50); // method is ambigous
    System.out.println(index);
  }

  // Uncomment: shadowing importing with this method
  // public static int binarySearch(int[] a, int key) {
  //   return -1;
  // }
}

