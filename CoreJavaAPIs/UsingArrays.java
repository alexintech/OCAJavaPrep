import java.util.*;

public class UsingArrays {
  public static void main(String[] args) {
    String[] strings = { "stringValue", "anotherString" };
    System.out.println(Arrays.toString(strings));

    Object[] objects = strings;
    String[] againStrings = (String[]) objects;
    //! againStrings[0] = new StringBuilder();  // error: incompatible types
    // objects[0] = new StringBuilder();  // throws ArrayStoreException

    int[] numbers = { 6, 9, 1 };
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    String[] strs = { "10", "9", "100", "a", "B" };
    Arrays.sort(strs);
    System.out.println(Arrays.toString(strs));

    int[] nums = {2, 4, 6, 8};
    System.out.println(Arrays.binarySearch(nums, 2)); // 0
    System.out.println(Arrays.binarySearch(nums, 4)); // 1
    System.out.println(Arrays.binarySearch(nums, 1)); // -1
    System.out.println(Arrays.binarySearch(nums, 3)); // -2
    System.out.println(Arrays.binarySearch(nums, 9)); // -5

    nums = new int[] {3, 2, 1}; // result is unpredictable, because array is not sorted
    System.out.println(Arrays.binarySearch(nums, 2));
    System.out.println(Arrays.binarySearch(nums, 3));

  }
}

