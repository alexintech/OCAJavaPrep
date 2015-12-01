import java.util.*;

public class WrapperTest {
  public static void main(String[] args) {
    int primitive = Integer.parseInt("123");
    Integer wrapper = Integer.valueOf("123");

    Byte bRef1 = (byte)10;
    Byte bRef2 = (byte)10;
    System.out.println(bRef1 == bRef2);       // true
    System.out.println(bRef1.equals(bRef2));  // true

    Integer iRef1 = 1000;
    Integer iRef2 = 1000;
    System.out.println(iRef1 == iRef2);       // false
    System.out.println(iRef1.equals(iRef2));  // true
    System.out.println(iRef1.hashCode());     // 1000
    System.out.println(Character.toUpperCase('б'));     // Б

    // int bad1 = Integer.parseInt("a");           // throws NumberFormatException
    // Integer bad2 = Integer.valueOf("123.45");   // throws NumberFormatException

    List<Integer> heights = new ArrayList<>();
    heights.add(null);
    // int h = heights.get(0);     // throws NullPointerException

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.remove(1);   // removes second element, because it's int index
    System.out.println(numbers);  // [1]
    numbers.remove(new Integer(1));   // forces wrapper class use
    System.out.println(numbers);  // []
  }
}

